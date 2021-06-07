package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList <Vehicle> myArray = new ArrayList<>();

        PoliceCar popo = new PoliceCar();
        Jeep rubicon = new Jeep();
        Hovercraft hover = new Hovercraft();
        Frigate fri = new Frigate();

        myArray.add(popo);
        myArray.add(rubicon);
        myArray.add(hover);
        myArray.add(fri);

        // Some interactions with the objects
        System.out.println("Police car");
        popo.drive();
        popo.soundSiren();
        popo.chase(rubicon);

        System.out.println("-----------------------");
        System.out.println("Jeep");
        rubicon.drive();
        rubicon.soundHorn();

        System.out.println("-----------------------");
        System.out.println("Hovercraft");
        hover.enterLand();
        hover.drive();
        hover.enterSea();
        hover.launch();

        System.out.println("-----------------------");
        System.out.println("Frigate");
        fri.launch();
        fri.fireGun();
    }
}
