package ru.javarush.island.volokitin.creators;

import ru.javarush.island.volokitin.entities.organisms.Organism;
import ru.javarush.island.volokitin.entities.settings.Settings;
import ru.javarush.island.volokitin.entities.world.Area;
import ru.javarush.island.volokitin.entities.world.World;
import ru.javarush.island.volokitin.util.Probability;

import java.util.*;

public class WorldCreator {
    public World createWorld() {
        World world = new World(Settings.get().getMapRows(), Settings.get().getMapCols());
        createAreas(world);
        findNearestAreas(world);

        return world;
    }

    private void createAreas(World world) {
        Area[][] areas = world.getAreas();

        for (int row = 0; row < areas.length; row++) {
            for (int col = 0; col < areas[row].length; col++) {
                areas[row][col] = createRandomArea();
            }
        }
    }

    private Area createRandomArea() {
        Map<String, Set<Organism>> inhabitants = new HashMap<>();
        OrganismFactory organismFactory = new OrganismFactory();

        for (Map.Entry<String, Integer> entry : Settings.get().getOrganismsInitialQuantity().entrySet()) {
            String organismType = entry.getKey();
            Integer organismQuantity = entry.getValue();

            Set<Organism> organismSet = new HashSet<>();
            for (int i = 0; i < organismQuantity; i++) {
                if (Probability.get(25)) {
                    organismSet.add(organismFactory.createOrganismByType(organismType));
                }
            }
            inhabitants.put(organismType, organismSet);
        }

        return new Area(inhabitants);
    }

    private void findNearestAreas(World world) {
        Area[][] areas = world.getAreas();
    }
}
