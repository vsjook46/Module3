package com.company.entity;

import com.company.interfaces.ICosting;

public class LowCost implements ICosting {

    private String name;
    private int distance;
    private int pricePerKilometer;

    public LowCost() {
    }

    public LowCost(String name, int distance, int pricePerKilometer) {
        this.name = name;
        this.distance = distance;
        this.pricePerKilometer = pricePerKilometer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public double getPricePerKilometer() {
        return pricePerKilometer;
    }

    public void setPricePerKilometer(int pricePerKilometer) {
        this.pricePerKilometer = pricePerKilometer;
    }

    @Override
    public int getCost() {
        return (int) (this.getPricePerKilometer()*this.getDistance());
    }
}
