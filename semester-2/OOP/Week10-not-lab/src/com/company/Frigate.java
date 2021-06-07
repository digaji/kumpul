package com.company;

public class Frigate extends Vehicle implements SeaVessel {

    public Frigate() {
        this.setName("Frigate");
        this.setMaxPassengers(300);
        this.setMaxSpeed(30);
    }

    @Override
    public void launch() {
        System.out.println("Set sail!");
    }

    public void fireGun() {
        System.out.println("Fire!");
    }
}
