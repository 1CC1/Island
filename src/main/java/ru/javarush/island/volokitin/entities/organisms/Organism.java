package ru.javarush.island.volokitin.entities.organisms;

import ru.javarush.island.volokitin.entities.settings.Settings;
import ru.javarush.island.volokitin.entities.world.Area;
import ru.javarush.island.volokitin.util.Randomizer;

public abstract class Organism {
    private final String type = this.getClass().getSimpleName();
    private double weight;

    public abstract void multiply(Area area);

    protected Organism() {
        OrganismsCommonSpecs organismCommonSpecs = Settings.get().getOrganismCommonSpecsByType(this.type);
        this.weight = Randomizer.getRandom(organismCommonSpecs.getMaxWeight() / 2.0D, organismCommonSpecs.getMaxWeight());
    }

    public String getType() {
        return type;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getChildrenQuantity() {
        Settings settings = Settings.get();
        Integer childrenQuantity = settings.getOrganismsChildrenQuantity().get(getType());
        OrganismsCommonSpecs commonSpecs = settings.getOrganismCommonSpecsByType(getType());

        return Randomizer.getRandom(0, Math.min(childrenQuantity, commonSpecs.getMaxQuantity()));
    }

    protected void growUp(Area area) {

    }
}
