package com.company;

public class Hovercraft extends Vehicle implements LandVehicle, SeaVessel{

    public Hovercraft() {
        this.setName("Hovercraft");
        this.setMaxPassengers(1);
        this.setMaxSpeed(100);
    }

    @Override
    public void drive() {
        System.out.println("Ngooooonggggggg");
    }

    @Override
    public void launch() {
        System.out.println("Time to hover!");
    }

    public void enterLand() {
        System.out.println("Entering land...");
    }

    public void enterSea() {
        System.out.println("Entering sea...");
    }
}
