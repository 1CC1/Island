package ru.javarush.island.volokitin.entities.world;

import ru.javarush.island.volokitin.entities.organisms.Organism;
import ru.javarush.island.volokitin.entities.organisms.OrganismsCommonSpecs;
import ru.javarush.island.volokitin.entities.settings.Settings;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.stream.Collectors;

public class Area {
    private Map<String, Set<Organism>> inhabitants;
    private List<Area> nearestAreas;
    private final Lock lock = new ReentrantLock(true);

    public Map<String, Set<Organism>> getInhabitants() {
        return inhabitants;
    }

    public void setInhabitants(Map<String, Set<Organism>> inhabitants) {
        this.inhabitants = inhabitants;
    }

    public List<Area> getNearestAreas() {
        return nearestAreas;
    }

    public void setNearestAreas(List<Area> nearestAreas) {
        this.nearestAreas = nearestAreas;
    }

    @Override
    public String toString() {
        HashMap<String, Long> areaStatistics = new HashMap<>();

        inhabitants.entrySet().stream()
                .forEach(entry -> {
                    OrganismsCommonSpecs organismCommonSpecs = Settings.get().getOrganismCommonSpecsByType(entry.getKey());
                    String icon = organismCommonSpecs.getIcon();
                    long count = entry.getValue().stream().count();
                    areaStatistics.put(icon, count);
                });

        return areaStatistics.toString();
    }
}
