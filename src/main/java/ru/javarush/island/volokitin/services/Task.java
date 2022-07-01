package ru.javarush.island.volokitin.services;

import ru.javarush.island.volokitin.entities.organisms.Organism;
import ru.javarush.island.volokitin.entities.organisms.animals.Animal;
import ru.javarush.island.volokitin.entities.world.Area;

public class Task {
    private final Organism organism;
    private final Area area;

    public Task(Organism organism, Area area) {
        this.organism = organism;
        this.area = area;
    }

    public void perform() {
        if(organism instanceof Animal animal){
//            animal.move(area);
//            animal.eat(area);
        }
        organism.multiply(area);
        // TODO - some everyday routine
        // this.growUp(area);
        // lose weight
        // accidental death
    }
}
