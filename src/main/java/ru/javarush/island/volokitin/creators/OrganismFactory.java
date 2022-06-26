package ru.javarush.island.volokitin.creators;

import ru.javarush.island.volokitin.entities.organisms.Organism;
import ru.javarush.island.volokitin.entities.organisms.animals.carnivores.*;
import ru.javarush.island.volokitin.entities.organisms.animals.herbivores.*;
import ru.javarush.island.volokitin.entities.organisms.plants.Plant;

public class OrganismFactory {
    public Organism createOrganismByType(String organismType) {
        return switch (organismType) {
            case "Plant" -> new Plant();
            case "Bear" -> new Bear();
            case "Boa" -> new Boa();
            case "Eagle" -> new Eagle();
            case "Fox" -> new Fox();
            case "Wolf" -> new Wolf();
            case "Boar" -> new Boar();
            case "Buffalo" -> new Buffalo();
            case "Caterpillar" -> new Caterpillar();
            case "Deer" -> new Deer();
            case "Duck" -> new Duck();
            case "Goat" -> new Goat();
            case "Horse" -> new Horse();
            case "Mouse" -> new Mouse();
            case "Rabbit" -> new Rabbit();
            case "Sheep" -> new Sheep();
            default -> throw new IllegalArgumentException("Неправильный тип организма: " + organismType);
        };
    }
}
