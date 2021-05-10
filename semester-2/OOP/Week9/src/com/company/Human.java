package com.company;

public class Human {
    public void sleep() {
        System.out.println("Zzz...");
    }

    public void sleep(int minutes) {
        System.out.println("Gonna sleep in " + minutes + " minutes!");
    }

    public void sleep(String somebody) {
        System.out.println("Goodnight " + somebody);
    }

    public void eat() {
        System.out.println("Om nom nom");
    }
}
