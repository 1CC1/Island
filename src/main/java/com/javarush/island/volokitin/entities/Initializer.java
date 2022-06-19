package com.javarush.island.volokitin.entities;

import com.fasterxml.jackson.dataformat.yaml.YAMLMapper;

import java.io.File;
import java.io.IOException;

public class Initializer {
    public static final String INIT_FILE = System.getProperty("user.dir") + File.separator + "files" + File.separator + "init.yml";

    public Settings initialize() {
        Settings settings = null;
        try {
            File file = new File(INIT_FILE);
            settings = new YAMLMapper().readValue(file, Settings.class);
        } catch (IOException e) {
            System.out.println("An error occurred while reading init.yml file");
        }

        return settings;
    }
}
