package ru.javarush.island.volokitin.entities.organisms.animals;

import ru.javarush.island.volokitin.entities.organisms.Organism;
import ru.javarush.island.volokitin.entities.organisms.OrganismsCommonSpecs;
import ru.javarush.island.volokitin.entities.settings.Settings;
import ru.javarush.island.volokitin.entities.world.Area;
import ru.javarush.island.volokitin.factories.Factories;
import ru.javarush.island.volokitin.util.Randomizer;

import java.util.*;

public abstract class Animal extends Organism {

    public Animal() {
        super();
    }

    @Override
    public void multiply(Area area) {
//        safeMultiply(area);
    }

    private void safeMultiply(Area area) {
        area.getLock().lock();
        try {
            int sameAnimalTypeQuantity = area.getInhabitants().get(this.getType()).toArray().length;
            int newPlantsQuantity = this.getChildrenQuantity();

            if (newPlantsQuantity > 0 && sameAnimalTypeQuantity > 0 && Randomizer.getProbability(50)) {
                for (int i = 0; i < newPlantsQuantity; i++) {
                    if (Randomizer.getProbability(90)) {
                        Organism newAnimal = Factories.createOrganismByType(this.getType());
                        area.addInhabitant(this.getType(), newAnimal);
                    }
                }
            }
        } finally {
            area.getLock().lock();
        }
    }

    public void eat(Area area) {
        if (safeEat(area)) {

        }
    }

    private boolean safeEat(Area area) {
        area.getLock().lock();
        boolean ate = false;

        try {
            Settings settings = Settings.get();
            OrganismsCommonSpecs animalCommonSpecs = settings.getOrganismCommonSpecsByType(this.getType());

            double weightDiff = animalCommonSpecs.getMaxWeight() - this.getWeight();
            double foodRequired = Math.min(weightDiff, animalCommonSpecs.getMaxFoodRequired());
            if (foodRequired > 0) {
                Map<String, Integer> chanceToGetEatMap = settings.getChanceToGetEat().get(this.getType());
                Iterator<Map.Entry<String, Integer>> chanceToGetEatIterator = chanceToGetEatMap.entrySet().iterator();
                while (foodRequired > 0 && chanceToGetEatIterator.hasNext()) {
                    Map.Entry<String, Integer> chanceToGetEat = chanceToGetEatIterator.next();
                    String foodType = chanceToGetEat.getKey();
                    Integer chanceToEat = chanceToGetEat.getValue();

                    Set<Organism> foodSet = area.getInhabitants().get(foodType);
                    if (Randomizer.getProbability(chanceToEat) && foodSet != null && !foodSet.isEmpty()) {
                        Iterator<Organism> foodIterator = foodSet.iterator();
                        if (foodIterator.hasNext()) {
                            Organism food = foodIterator.next();
                            double mealWeight = Math.min(foodRequired, food.getWeight());
                            foodRequired -= mealWeight;
                            setWeight(getWeight() + mealWeight);
                            food.setWeight(food.getWeight() - mealWeight);

                            if (food.getWeight() < 0) { // съели целиком
                                foodIterator.remove();
                            }

                            ate = true;
                            if (foodRequired <= 0) {
                                break;
                            }
                        }
                    }
                }
            }
        } finally {
            area.getLock().unlock();
        }

        return ate; //TODO - delete
    }

    public void move(Area area) {
    }
}
