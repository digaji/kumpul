package com.company;

public class Cat extends Animal implements LivingThing {

    public Cat(int numberOfLegs, boolean hasTail) {
        super(numberOfLegs, hasTail);
    }

    @Override
    public void makeSound() {
        System.out.println("Meow!");
    }

    @Override
    public void breathe() {
        System.out.println("Cat breathes in");
    }

    @Override
    public void eat() {
        System.out.println("Cat eats fish");
    }

    @Override
    public void sleep() {
        System.out.println("Zzz");
    }
}
