package com.javarush.island.volokitin.entities.settings;

import com.javarush.island.volokitin.entities.OrganismSpecifications;

import java.util.HashMap;

public class Settings {
    public final int mapRows;
    public final int mapCols;
    public final int cycleDuration; // millis
    public final HashMap<String, Integer> organismsInitialQuantity;
    public final Boolean stopIfAllAnimalsDead;
    public final Boolean stopIfTimeIsOver;
    public final int gameDuration;
    public final HashMap<String, Integer> organismsYoungsQuantity;
    public final HashMap<String, HashMap<String, Integer>> chanceToGetEat;
    public final HashMap<String, OrganismSpecifications> organismsSpecifications;

    public Settings() {
        mapRows = 0;
        mapCols = 0;
        cycleDuration = 0;
        organismsInitialQuantity = null;
        stopIfAllAnimalsDead = false;
        stopIfTimeIsOver = false;
        gameDuration = 0;
        organismsYoungsQuantity = null;
        chanceToGetEat = null;
        organismsSpecifications = null;
    }

    @Override
    public String toString() {
        return "Settings{" +
                "\nmapRows=" + mapRows +
                ", \nmapCols=" + mapCols +
                ", \ncycleDuration=" + cycleDuration +
                ", \norganismsInitialQuantity=" + organismsInitialQuantity +
                ", \nstopIfAllAnimalsDead=" + stopIfAllAnimalsDead +
                ", \nstopIfTimeIsOver=" + stopIfTimeIsOver +
                ", \ngameDuration=" + gameDuration +
                ", \norganismsYoungsQuantity=" + organismsYoungsQuantity +
                ", \nchanceToGetEat=" + chanceToGetEat +
                ", \norganismsSpecifications=" + organismsSpecifications +
                '}';
    }
}
