package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(new Dog(4, true));
        animals.add(new Cat(4, true));
        animals.add(new Gorilla(2, false));

        animals.get(0).makeSound(); // Dog
        System.out.println();
        animals.get(1).makeSound(); // Cat
        System.out.println();
        animals.get(2).makeSound(); // Gorilla
        System.out.println();

        animals.get(0).wagTail();   // Dog
        System.out.println();
        animals.get(1).wagTail();   // Cat
        System.out.println();
        animals.get(2).wagTail();   // Gorilla

        System.out.println("--------------------------------");

        ArrayList<LivingThing> things = new ArrayList<>();
        things.add((LivingThing) animals.get(0));
        things.add((LivingThing) animals.get(1));
        things.add((LivingThing) animals.get(2));

        // Dog
        things.get(0).breathe();
        things.get(0).eat();
        things.get(0).sleep();
        System.out.println();

        // Cat
        things.get(1).breathe();
        things.get(1).eat();
        things.get(1).sleep();
        System.out.println();

        // Gorilla
        things.get(2).breathe();
        things.get(2).eat();
        things.get(2).sleep();
    }
}
