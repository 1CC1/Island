package com.javarush.island.volokitin.entities;

import java.util.Map;

public class Settings {
    public final int fieldRows;
    public final int fieldCols;
    public final int cycleDuration; // millis
    public final Map<String, Integer> organismsInitialQuantity;
    public final Boolean stopIfAllAnimalsDead;
    public final Boolean stopIfTimeIsOver;
    public final int gameDuration;

    public Settings() {
        fieldRows = 0;
        fieldCols = 0;
        cycleDuration = 0;
        organismsInitialQuantity = null;
        stopIfAllAnimalsDead = false;
        stopIfTimeIsOver = false;
        gameDuration = 0;
    }

    @Override
    public String toString() {
        return "Settings{" +
                "\nfieldRows=" + fieldRows +
                ", \nfieldCols=" + fieldCols +
                ", \ncycleDuration=" + cycleDuration +
                ", \norganismsInitialQuantity=" + organismsInitialQuantity +
                '}';
    }
}
