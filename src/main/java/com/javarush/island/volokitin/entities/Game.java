package com.javarush.island.volokitin.entities;

import com.javarush.island.volokitin.entities.map.GameMap;

public class Game {
    private final Settings settings;
    private final GameMap gameMap;

    public Game(Settings settings, GameMap gameMap) {
        this.settings = settings;
        this.gameMap = gameMap;
    }
}
