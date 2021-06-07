package com.company;

public class Jeep extends Vehicle implements LandVehicle {

    public Jeep() {
        this.setName("Jeep");
        this.setMaxPassengers(5);
        this.setMaxSpeed(100);
    }

    @Override
    public void drive() {
        System.out.println("Nguuuuunggggggg");
    }

    public void soundHorn() {
        System.out.println("Beep, beep!");
    }
}
