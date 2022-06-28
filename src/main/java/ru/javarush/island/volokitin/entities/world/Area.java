package ru.javarush.island.volokitin.entities.world;

import ru.javarush.island.volokitin.entities.organisms.Organism;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Area {
    private Map<String, Set<Organism>> inhabitants;
    private List<Area> nearestAreas;

    public Area(Map<String, Set<Organism>> inhabitants) {
        this.inhabitants = inhabitants;
    }

    public Map<String, Set<Organism>> getInhabitants() {
        return inhabitants;
    }

//    public void setInhabitants(Map<String, Set<Organism>> inhabitants) {
//        this.inhabitants = inhabitants;
//    }

    public List<Area> getNearestAreas() {
        return nearestAreas;
    }

    public void setNearestAreas(List<Area> nearestAreas) {
        this.nearestAreas = nearestAreas;
    }
}
