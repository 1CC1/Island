package ru.javarush.island.volokitin.entities.organisms;

import ru.javarush.island.volokitin.entities.settings.Settings;
import ru.javarush.island.volokitin.util.Randomizer;

public abstract class Organism {
    private final String type = this.getClass().getSimpleName();
    private double weight;

    protected Organism() {
        OrganismsCommonSpecs organismCommonSpecs = Settings.get().getOrganismCommonSpecsByType(this.type);
        this.weight = Randomizer.getRandom(organismCommonSpecs.getMaxWeight() / 2.0D, organismCommonSpecs.getMaxWeight());
    }
}
