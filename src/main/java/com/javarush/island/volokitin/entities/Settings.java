package com.javarush.island.volokitin.entities;

import java.util.HashMap;

public class Settings {
    public final int fieldRows;
    public final int fieldCols;
    public final int cycleDuration; // millis
    public final HashMap<String, Integer> organismsInitialQuantity;
    public final Boolean stopIfAllAnimalsDead;
    public final Boolean stopIfTimeIsOver;
    public final int gameDuration;
    public final HashMap<String, Integer> organismsYoungsQuantity;
    public final HashMap<String, HashMap<String, Integer>> chanceToGetEat;

    public Settings() {
        fieldRows = 0;
        fieldCols = 0;
        cycleDuration = 0;
        organismsInitialQuantity = null;
        stopIfAllAnimalsDead = false;
        stopIfTimeIsOver = false;
        gameDuration = 0;
        organismsYoungsQuantity = null;
        chanceToGetEat = null;
    }

    @Override
    public String toString() {
        return "Settings{" +
                "\nfieldRows=" + fieldRows +
                ", \nfieldCols=" + fieldCols +
                ", \ncycleDuration=" + cycleDuration +
                ", \norganismsInitialQuantity=" + organismsInitialQuantity +
                ", \nstopIfAllAnimalsDead=" + stopIfAllAnimalsDead +
                ", \nstopIfTimeIsOver=" + stopIfTimeIsOver +
                ", \ngameDuration=" + gameDuration +
                ", \norganismsYoungsQuantity=" + organismsYoungsQuantity +
                ", \nchanceToGetEat=" + chanceToGetEat +
                '}';
    }
}
