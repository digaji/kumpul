package com.company;

public abstract class Vehicle {

    private String name;
    private int maxPassengers;
    private int maxSpeed;

    public String getName() {
        return name;
    }

    public int getMaxPassengers() {
        return maxPassengers;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMaxPassengers(int num) {
        this.maxPassengers = num;
    }

    public void setMaxSpeed(int num) {
        this.maxSpeed = num;
    }
}
