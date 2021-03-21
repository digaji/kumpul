package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class AscendedExercise1Part1 {
    public static void main(String[] args) {
        // Put ID, Full Name, and Favorite Colour in 3 separate arrays
        long[] id = {2440074174L, 2440071973L, 2440100273L, 2440102493L, 2440061285L};
        String[] name = {"Morris Kim", "Raphael Reynaldi", "Ariel Putra", "Raffles Teh Weihan", "Monique Senjaya"};
        String[] colour = {"Violet", "Red", "Yellow", "Green", "Blue"};

        // Part 1
        // Sort information according to either Name or Colour (choice)
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        int[] index = new int[name.length];
        String[] updated = new String[name.length];

        while (flag) {
            System.out.println("Welcome to the sorting data exercise\n\nHere are your choices:");
            System.out.println("[1] Sort by NAME");
            System.out.println("[2] Sort by COLOUR");
            System.out.println("[3] Exit Program");

            System.out.print("Enter your choice >> ");
            int choice = sc.nextInt();
            System.out.println();

            switch (choice) {
                case 1 -> {
                    String[] copyName = name.clone();
                    // Sort with Arrays utility class
                    Arrays.sort(copyName);

                    // Sort index according to sorted copyName
                    for (int i = 0; i < name.length; i++) {
                        for (int j = 0; j < name.length; j++) {
                            if (name[j].equals(copyName[i])) {
                                index[i] = j;
                            }
                        }
                    }

                    // Updating
                    for (int i = 0; i < index.length; i++) {
                        updated[i] = colour[index[i]];
                    }

                    System.out.println("Original data:");
                    for (int i = 0; i < name.length; i++) {
                        System.out.printf("%-25s %-10s %n", name[i], colour[i]);
                    }
                    System.out.println();

                    System.out.println("Sorted by Name:");
                    for (int i = 0; i < name.length; i++) {
                        System.out.printf("%-25s %-10s %n", copyName[i], updated[i]);
                    }
                    System.out.println();
                }
                case 2 -> {
                    String[] copyColour = colour.clone();
                    // Sort with Arrays utility class
                    Arrays.sort(copyColour);

                    // Sort index according to sorted copyColour
                    for (int i = 0; i < colour.length; i++) {
                        for (int j = 0; j < colour.length; j++) {
                            if (colour[j].equals(copyColour[i])) {
                                index[i] = j;
                            }
                        }
                    }

                    // Updating
                    for (int i = 0; i < index.length; i++) {
                        updated[i] = name[index[i]];
                    }

                    System.out.println("Original data:");
                    for (int i = 0; i < colour.length; i++) {
                        System.out.printf("%-10s %-25s %n", colour[i], name[i]);
                    }
                    System.out.println();

                    System.out.println("Sorted by Colour:");
                    for (int i = 0; i < colour.length; i++) {
                        System.out.printf("%-10s %-25s %n", copyColour[i], updated[i]);
                    }
                    System.out.println();
                }
                case 3 -> {
                    System.out.println("Goodbye!");
                    flag = false;
                }
                default -> System.out.println("Not a choice! Try again.");
            }
        }
    }
}