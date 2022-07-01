package ru.javarush.island.volokitin.entities.organisms.plants;

import ru.javarush.island.volokitin.entities.organisms.Organism;
import ru.javarush.island.volokitin.entities.organisms.OrganismsCommonSpecs;
import ru.javarush.island.volokitin.entities.settings.Settings;
import ru.javarush.island.volokitin.entities.world.Area;
import ru.javarush.island.volokitin.factories.Factories;
import ru.javarush.island.volokitin.util.Randomizer;

import java.util.Set;

public class Plant extends Organism {
    public Plant() {
        super();
    }

    @Override
    public void multiply(Area area) {
        safeMultiply(area);
    }

    private void safeMultiply(Area area) {
        area.getLock().lock();
        try {
            int newPlantsQuantity = getChildrenQuantity();
            if (newPlantsQuantity > 0) {
                for (int i = 0; i < newPlantsQuantity; i++) {
                    if (Randomizer.getProbability(5)) {
                        Organism newPlant = Factories.createOrganismByType(this.getType());
                        area.addInhabitant(this.getType(), newPlant);
                    }
                }
            }
        } finally {
            area.getLock().lock();
        }
    }
}
