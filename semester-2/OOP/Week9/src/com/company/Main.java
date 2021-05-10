package com.company;

public class Main {

    public static void main(String[] args) {
        Human person = new Human();
        Bob bob = new Bob();
        Jim jim = new Jim();

        System.out.println("Static polymorphism example\n-------------------------");
        System.out.println("Person's sleep:");
        person.sleep();
        System.out.println();

        System.out.println("Bob's sleep:");
        bob.sleep(5);
        System.out.println();

        System.out.println("Jim's sleep:");
        jim.sleep("Honey");
        System.out.println();

        System.out.println("Dynamic polymorphism example\n-------------------------");
        System.out.println("Person's eat:");
        person.eat();
        System.out.println();

        System.out.println("Bob's eat:");
        bob.eat();
        System.out.println();

        System.out.println("Jim's eat:");
        jim.eat();
    }
}
