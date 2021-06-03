package com.company;

public abstract class Animal {

    public Animal(int numberOfLegs, boolean hasTail) {
        this.numberOfLegs = numberOfLegs;
        this.hasTail = hasTail;
    }

    protected int numberOfLegs;
    protected boolean hasTail;

    public abstract void makeSound();

    public void wagTail() {
        if (this.hasTail) {
            System.out.println("Wagging tail...");
        } else {
            System.out.println("No tail...");
        }
    }
}
