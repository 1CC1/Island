package ru.javarush.island.volokitin.util;

import java.util.concurrent.ThreadLocalRandom;

public class Probability {
    public static boolean get(int percent) {
        return random(0, 100) < percent;
    }

    public static int random(int from, int to) {
        return ThreadLocalRandom.current().nextInt(from, to);
    }
}
