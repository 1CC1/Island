package com.javarush.island.volokitin.entities;

public class OrganismSpecifications {
    private float weight;
    private int maxQuantity;
    private int speed;
    private float foodRequired;

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
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

    public OrganismSpecifications() {
    }

    public OrganismSpecifications(float weight, int maxQuantity, int speed, float foodRequired) {
        this.weight = weight;
        this.maxQuantity = maxQuantity;
        this.speed = speed;
        this.foodRequired = foodRequired;
    }
}
