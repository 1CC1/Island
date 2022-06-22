package com.javarush.island.volokitin.entities.world;

import com.javarush.island.volokitin.entities.organisms.Organism;

import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class Area {
    private HashMap<String, Set<Organism>> inhabitants = new HashMap<>();
    private List<Area> nearAreas;
}
