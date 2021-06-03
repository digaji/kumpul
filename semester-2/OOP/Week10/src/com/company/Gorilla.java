package com.company;

public class Gorilla extends Animal implements LivingThing {

    public Gorilla(int numberOfLegs, boolean hasTail) {
        super(numberOfLegs, hasTail);
    }

    @Override
    public void makeSound() {
        System.out.println("Ooo Ooo Aaa Aaa!");
    }

    @Override
    public void breathe() {
        System.out.println("Gorilla breathes in");
    }

    @Override
    public void eat() {
        System.out.println("Gorilla eats banana");
    }

    @Override
    public void sleep() {
        System.out.println("Zzz");
    }
}
