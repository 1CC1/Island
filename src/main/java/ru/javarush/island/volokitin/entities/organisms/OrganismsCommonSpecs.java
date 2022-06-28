package ru.javarush.island.volokitin.entities.organisms;

public class OrganismsCommonSpecs {
    private String name;
    private String icon;
    private double maxWeight;
    private int maxQuantity;
    private int speed;
    private float foodRequired;

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

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public float getFoodRequired() {
        return foodRequired;
    }

    public void setFoodRequired(float foodRequired) {
        this.foodRequired = foodRequired;
    }

    public OrganismsCommonSpecs() {
    }

    public OrganismsCommonSpecs(String name, String icon, double maxWeight, int maxQuantity, int speed, float foodRequired) {
        this.name = name;
        this.icon = icon;
        this.maxWeight = maxWeight;
        this.maxQuantity = maxQuantity;
        this.speed = speed;
        this.foodRequired = foodRequired;
    }
}
