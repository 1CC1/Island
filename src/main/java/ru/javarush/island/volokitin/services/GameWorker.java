package ru.javarush.island.volokitin.services;

import ru.javarush.island.volokitin.entities.Game;
import ru.javarush.island.volokitin.entities.settings.Settings;

import java.util.concurrent.*;

public class GameWorker extends Thread {
    private final Game game;
    private final int CORE_POOL_SIZE = 4;
    private final long GAME_CYCLE_DURATION = Settings.get().getCycleDuration();

    public GameWorker(Game game) {
        this.game = game;
    }

    @Override
    public void run() {
        game.showStatistics();

//        ScheduledExecutorService scheduledThreadPool = Executors.newScheduledThreadPool(CORE_POOL_SIZE);
//        scheduledThreadPool.scheduleWithFixedDelay(new Runnable() {
//            @Override
//            public void run() {
//
//            }
//        }, GAME_CYCLE_DURATION, GAME_CYCLE_DURATION, TimeUnit.MILLISECONDS);
    }

}