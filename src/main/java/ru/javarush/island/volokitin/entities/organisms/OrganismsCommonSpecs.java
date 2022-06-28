package ru.javarush.island.volokitin.entities.organisms;

public class OrganismsCommonSpecs {
    private String name;
    private String icon;
    private double maxWeight;
    private int maxQuantity;
    private int maxSpeed;
    private float maxFoodRequired;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public double getMaxWeight() {
        return maxWeight;
    }

    public void setMaxWeight(double maxWeight) {
        this.maxWeight = maxWeight;
    }

    public int getMaxQuantity() {
        return maxQuantity;
    }

    public void setMaxQuantity(int maxQuantity) {
        this.maxQuantity = maxQuantity;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public float getMaxFoodRequired() {
        return maxFoodRequired;
    }

    public void setMaxFoodRequired(float maxFoodRequired) {
        this.maxFoodRequired = maxFoodRequired;
    }

    public OrganismsCommonSpecs() {
    }

    public OrganismsCommonSpecs(String name, String icon, double maxWeight, int maxQuantity, int maxSpeed, float maxFoodRequired) {
        this.name = name;
        this.icon = icon;
        this.maxWeight = maxWeight;
        this.maxQuantity = maxQuantity;
        this.maxSpeed = maxSpeed;
        this.maxFoodRequired = maxFoodRequired;
    }
}
