package com.javarush.island.volokitin;

import com.javarush.island.volokitin.entities.Game;
import com.javarush.island.volokitin.entities.Initializer;
import com.javarush.island.volokitin.entities.Settings;
import com.javarush.island.volokitin.entities.map.GameMap;
import com.javarush.island.volokitin.services.GameWorker;

public class Runner {
    public static void main(String[] args) {
        Initializer initializer = new Initializer();
        Settings settings = initializer.initialize();
        GameMap gameMap = new GameMap();
        Game game = new Game(settings, gameMap);
        GameWorker gameWorker = new GameWorker(game);
        gameWorker.start();
//        game.createMap();
    }
}
