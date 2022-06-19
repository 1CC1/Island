package com.javarush.island.volokitin;

import com.javarush.island.volokitin.entities.Initializer;
import com.javarush.island.volokitin.entities.Settings;

public class Runner {
    public static void main(String[] args) {
        Initializer initializer = new Initializer();
        Settings settings = initializer.initialize();

        System.out.println(settings.toString());
//        Game game = new Game(initializer);
//        game.createMap();
    }
}
