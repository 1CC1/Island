package ru.javarush.island.volokitin.entities.settings;

import ru.javarush.island.volokitin.entities.world.World;
import ru.javarush.island.volokitin.creators.WorldCreator;

public class Initializer {
    public World createWorld() {
        WorldCreator worldCreator = new WorldCreator();
        return worldCreator.createWorld();
    }
}
