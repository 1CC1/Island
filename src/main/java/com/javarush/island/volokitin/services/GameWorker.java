package com.javarush.island.volokitin.services;

import com.javarush.island.volokitin.entities.Game;

public class GameWorker extends Thread {
    private final Game game;

    public GameWorker(Game game) {
        this.game = game;
    }

    @Override
    public void run() {
        super.run();
    }
}