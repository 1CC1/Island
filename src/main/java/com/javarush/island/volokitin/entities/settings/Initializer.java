package com.javarush.island.volokitin.entities.settings;

import com.fasterxml.jackson.dataformat.yaml.YAMLMapper;
import com.javarush.island.volokitin.entities.world.World;

import java.io.File;
import java.io.IOException;

public class Initializer {
    private static final String INIT_FILE = System.getProperty("user.dir") + File.separator + "files" + File.separator + "init.yml";

    public Settings readSettings() {
        Settings settings = null;
        try {
            File file = new File(INIT_FILE);
            settings = new YAMLMapper().readValue(file, Settings.class);
        } catch (IOException e) {
            System.out.printf("An error occurred while reading init.yml file: %s", e.toString());
        }

        return settings;
    }

    public World createWorld(Settings settings) {
        World world = new World(settings.mapRows, settings.mapCols);
        world.create(settings);

        return world;
    }
}
