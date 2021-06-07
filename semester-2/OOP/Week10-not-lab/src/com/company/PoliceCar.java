package com.company;

public class PoliceCar extends Vehicle implements IsEmergency, LandVehicle {

    public PoliceCar() {
        this.setName("Police Car");
        this.setMaxPassengers(5);
        this.setMaxSpeed(100);
    }

    @Override
    public void soundSiren() {
        System.out.println("Ni nu ni nu ni nu...");
    }

    @Override
    public void drive() {
        System.out.println("Ngeeeenggggggg");
    }

    public void chase(Vehicle prey) {
        System.out.println("Chase after the " + prey.getName());
    }
}
