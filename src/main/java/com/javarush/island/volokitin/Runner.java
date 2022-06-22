package com.javarush.island.volokitin;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.javarush.island.volokitin.entities.settings.Initializer;
import com.javarush.island.volokitin.entities.settings.Settings;
import com.javarush.island.volokitin.entities.world.World;


public class Runner {
    public static void main(String[] args) throws JsonProcessingException {
        Initializer initializer = new Initializer();
        Settings settings = initializer.readSettings();
        World world = initializer.createWorld(settings);
//        Game game = new Game(settings, world);
//        GameWorker gameWorker = new GameWorker(game);
//        gameWorker.run();
//        gameWorker.start();

//        game.createMap();
    }
}
