package com.javarush.island.volokitin.entities.world;

import com.javarush.island.volokitin.entities.settings.Settings;

public class World {
    private final Area[][] areas;

    public World(int rows, int cols) {
        areas = new Area[rows][cols];
    }

    public void create(Settings settings) {
        // creating of areas
        for (int row = 0; row < areas.length; row++) {
            for (int col = 0; col < areas[row].length; col++) {
//                areas[row][col] =
            }
        }

        // finding the nearest areas

    }
}
