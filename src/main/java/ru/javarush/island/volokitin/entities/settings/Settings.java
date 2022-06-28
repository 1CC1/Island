package ru.javarush.island.volokitin.entities.settings;

import com.fasterxml.jackson.databind.ObjectReader;
import com.fasterxml.jackson.dataformat.yaml.YAMLMapper;
import ru.javarush.island.volokitin.entities.organisms.OrganismsCommonSpecs;

import java.io.IOException;
import java.net.URL;
import java.util.Map;
import java.util.Objects;

public class Settings {
    private static final String INIT_FILE = "init.yml";
    private static volatile Settings SETTINGS;

    private int mapRows;
    private int mapCols;
    private int cycleDuration; // millis
    private Map<String, Integer> organismsInitialQuantity;
    private Boolean stopIfAllAnimalsDead;
    private Boolean stopIfTimeIsOver;
    private int gameDuration;
    private Map<String, Integer> organismsYoungsQuantity;
    private Map<String, Map<String, Integer>> chanceToGetEat;
    private Map<String, OrganismsCommonSpecs> organismsCommonSpecs;

    public static Settings get() {
        Settings settings = SETTINGS;

        if (Objects.isNull(settings)) {
            synchronized (Settings.class) {
                if (Objects.isNull(settings = SETTINGS)) {
                    settings = SETTINGS = new Settings();
                }
            }
        }

        return settings;
    }

    private Settings() {
        try {
            URL resource = Settings.class.getClassLoader().getResource(INIT_FILE);
            ObjectReader objectReader = new YAMLMapper().readerForUpdating(this);
            if (Objects.nonNull(resource)) {
                objectReader.readValue(resource.openStream());
            }
        } catch (IOException e) {
            System.out.printf("Ошибка при чтении файла настроек init.yml: %s", e.toString());
        }
    }

    public int getMapRows() {
        return mapRows;
    }

    public int getMapCols() {
        return mapCols;
    }

    public Map<String, Integer> getOrganismsInitialQuantity() {
        return organismsInitialQuantity;
    }

    public int getCycleDuration() {
        return cycleDuration;
    }

    public Boolean getStopIfAllAnimalsDead() {
        return stopIfAllAnimalsDead;
    }

    public Boolean getStopIfTimeIsOver() {
        return stopIfTimeIsOver;
    }

    public int getGameDuration() {
        return gameDuration;
    }

    public Map<String, Integer> getOrganismsYoungsQuantity() {
        return organismsYoungsQuantity;
    }

    public Map<String, Map<String, Integer>> getChanceToGetEat() {
        return chanceToGetEat;
    }

    public Map<String, OrganismsCommonSpecs> getOrganismsCommonSpecs() {
        return this.organismsCommonSpecs;
    }

    public OrganismsCommonSpecs getOrganismCommonSpecsByType(String organismType) {
        return (OrganismsCommonSpecs)this.organismsCommonSpecs.get(organismType);
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
                ", \norganismsCommonSpecs=" + organismsCommonSpecs +
                '}';
    }
}
