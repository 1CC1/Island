package ru.javarush.island.volokitin.entities;

import ru.javarush.island.volokitin.entities.world.World;
import ru.javarush.island.volokitin.entities.settings.Settings;

public class Game {
    private final Settings settings;
    private final World gameMap;

    public Game(Settings settings, World gameMap) {
        this.settings = settings;
        this.gameMap = gameMap;
    }
}
