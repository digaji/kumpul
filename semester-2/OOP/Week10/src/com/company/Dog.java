package com.company;

public class Dog extends Animal implements LivingThing {

    public Dog(int numberOfLegs, boolean hasTail) {
        super(numberOfLegs, hasTail);
    }

    @Override
    public void makeSound() {
        System.out.println("Woof!");
    }

    @Override
    public void breathe() {
        System.out.println("Dog breathes in");
    }

    @Override
    public void eat() {
        System.out.println("Dog eats bone");
    }

    @Override
    public void sleep() {
        System.out.println("Zzz");
    }
}
