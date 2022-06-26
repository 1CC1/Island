package ru.javarush.island.volokitin.entities.world;

import ru.javarush.island.volokitin.entities.organisms.Organism;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Area {
    private Map<String, Set<Organism>> inhabitants;
    private List<Area> nearAreas;

    public Area(Map<String, Set<Organism>> inhabitants) {
        this.inhabitants = inhabitants;
    }

    public Map<String, Set<Organism>> getInhabitants() {
        return inhabitants;
    }

    public void setInhabitants(Map<String, Set<Organism>> inhabitants) {
        this.inhabitants = inhabitants;
    }

    public List<Area> getNearAreas() {
        return nearAreas;
    }

    public void setNearAreas(List<Area> nearAreas) {
        this.nearAreas = nearAreas;
    }
}
