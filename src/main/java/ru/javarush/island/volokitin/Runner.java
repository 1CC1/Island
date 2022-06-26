package ru.javarush.island.volokitin;

import ru.javarush.island.volokitin.entities.settings.Initializer;
import ru.javarush.island.volokitin.entities.world.World;


public class Runner {
    public static void main(String[] args) {
        Initializer initializer = new Initializer();
        World world = initializer.createWorld();

        //        Game game = new Game(settings, world);
//        GameWorker gameWorker = new GameWorker(game);
//        gameWorker.run();
//        gameWorker.start();

//        game.createMap();
    }
}
