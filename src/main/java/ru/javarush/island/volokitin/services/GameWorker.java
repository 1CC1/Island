package ru.javarush.island.volokitin.services;

import ru.javarush.island.volokitin.entities.Game;
import ru.javarush.island.volokitin.entities.settings.Settings;

import java.util.ArrayList;
import java.util.concurrent.*;

public class GameWorker extends Thread {
    private final Game game;
    private final int CORE_POOL_SIZE = 4;
    private final long LIFE_CYCLE_DURATION = Settings.get().getCycleDuration();
    private final long GAME_DURATION = Settings.get().getGameDuration();

    public GameWorker(Game game) {
        this.game = game;
    }

    @Override
    public void run() {
        game.showStatistics();

        ArrayList<OrganismWorker> organismWorkers = new ArrayList<>();
        for (String organismType : Settings.get().getOrganismsTypes()) {
            organismWorkers.add(new OrganismWorker(organismType, game.getWorld()));
        }

//        organismWorkers.forEach(OrganismWorker::run);

        Runnable runAndWaitOrganismWorkers = () -> {
            ExecutorService fixedThreadPool = Executors.newFixedThreadPool(CORE_POOL_SIZE);
//            int i = 1;
            for (OrganismWorker organismWorker : organismWorkers) {
                fixedThreadPool.submit(organismWorker);

//                i++;
//                if(i>16) break;
            }
            fixedThreadPool.shutdown();

            try {
                if (fixedThreadPool.awaitTermination(Integer.MAX_VALUE, TimeUnit.DAYS)) {
//                if (fixedThreadPool.awaitTermination(2000, TimeUnit.MILLISECONDS)) {
                    game.showStatistics();
                }
            } catch (InterruptedException e) {
                System.out.println("The game is finished");
            }
        };

        ScheduledExecutorService scheduledThreadPool = Executors.newScheduledThreadPool(1);
        scheduledThreadPool.scheduleWithFixedDelay(runAndWaitOrganismWorkers, LIFE_CYCLE_DURATION, LIFE_CYCLE_DURATION, TimeUnit.MILLISECONDS);

//        if (GAME_DURATION != 0) {
//            try {
//                if (scheduledThreadPool.awaitTermination(GAME_DURATION, TimeUnit.MILLISECONDS)) {
//                    game.showStatistics();
//                }
//            } catch (InterruptedException e) {
//                System.out.println("The game is over by timeout");
//            }
//        }
    }

}