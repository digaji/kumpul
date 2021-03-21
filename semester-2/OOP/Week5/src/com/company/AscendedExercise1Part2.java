package com.company;

import java.util.*;

public class AscendedExercise1Part2 {
    public static void main(String[] args) {
        // Put ID, Full Name, and Favorite Colour in 3 separate vectors and 3 separate arraylists
        Vector<Long> idVector = new Vector<>();
        Vector<String> nameVector = new Vector<>();
        Vector<String> colourVector = new Vector<>();

        idVector.add(2440074174L);
        idVector.add(2440071973L);
        idVector.add(2440100273L);
        idVector.add(2440102493L);
        idVector.add(2440061285L);

        nameVector.add("Morris Kim");
        nameVector.add("Raphael Reynaldi");
        nameVector.add("Ariel Putra");
        nameVector.add("Raffles Teh Weihan");
        nameVector.add("Monique Senjaya");

        colourVector.add("Violet");
        colourVector.add("Red");
        colourVector.add("Yellow");
        colourVector.add("Green");
        colourVector.add("Blue");

        ArrayList<Long> idArrayList = new ArrayList<>(Arrays.asList(2440074174L, 2440071973L, 2440100273L, 2440102493L, 2440061285L));
        ArrayList<String> nameArrayList = new ArrayList<>(Arrays.asList("Morris Kim", "Raphael Reynaldi", "Ariel Putra", "Raffles Teh Weihan", "Monique Senjaya"));
        ArrayList<String> colourArrayList = new ArrayList<>(Arrays.asList("Violet", "Red", "Yellow", "Green", "Blue"));

        // Part 2
        // Redo Part 1 with Vector and ArrayList

        // Use the Arrays utility class to:
        // Sort the list of ID (print before and after sort)
        // Find specific ID in the array (returns index, if not found returns -1)
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        int[] index = new int[nameVector.size()];

        while (flag) {
            System.out.println("Welcome to the sorting data exercise V2\n\nHere are your choices:");
            System.out.println("[1] Use Vector");
            System.out.println("[2] Use ArrayList");
            System.out.println("[3] Sort ID");
            System.out.println("[4] Find ID index");
            System.out.println("[5] Exit Program");

            System.out.print("Enter your choice >> ");
            int choice = sc.nextInt();
            System.out.println();

            switch (choice) {
                // For Vector
                case 1 -> {
                    System.out.println("You picked Vector!\n\nHere are your choices:");
                    System.out.println("[1] Sort by NAME");
                    System.out.println("[2] Sort by COLOUR");

                    System.out.print("Enter your choice >> ");
                    int choiceNested = sc.nextInt();
                    System.out.println();

                    switch (choiceNested) {
                        case 1 -> {
                            Vector<String> copyName = new Vector<>(nameVector);

                            // Sort copyName with Collections class method
                            Collections.sort(copyName);

                            // Sort index according to sorted copyName
                            for (int i = 0; i < nameVector.size(); i++) {
                                for (int j = 0; j < nameVector.size(); j++) {
                                    if (nameVector.get(j).equals(copyName.get(i))) {
                                        index[i] = j;
                                    }
                                }
                            }
                            
                            Vector<String> updated = new Vector<>();

                            // Updating
                            for (int i = 0; i < index.length; i++) {
                                updated.add(i, colourVector.get(index[i]));
                            }

                            System.out.println("Original data:");
                            for (int i = 0; i < nameVector.size(); i++) {
                                System.out.printf("%-25s %-10s %n", nameVector.get(i), colourVector.get(i));
                            }
                            System.out.println();

                            System.out.println("Sorted by Name:");
                            for (int i = 0; i < nameVector.size(); i++) {
                                System.out.printf("%-25s %-10s %n", copyName.get(i), updated.get(i));
                            }
                            System.out.println();
                        }
                        case 2 -> {
                            Vector<String> copyColour = new Vector<>(colourVector);

                            // Sort copyColour with Collections class method
                            Collections.sort(copyColour);

                            // Sort index according to sorted copyColour
                            for (int i = 0; i < colourVector.size(); i++) {
                                for (int j = 0; j < colourVector.size(); j++) {
                                    if (colourVector.get(j).equals(copyColour.get(i))) {
                                        index[i] = j;
                                    }
                                }
                            }

                            Vector<String> updated = new Vector<>();

                            // Updating
                            for (int i = 0; i < index.length; i++) {
                                updated.add(i, nameVector.get(index[i]));
                            }

                            System.out.println("Original data:");
                            for (int i = 0; i < colourVector.size(); i++) {
                                System.out.printf("%-10s %-25s %n", colourVector.get(i), nameVector.get(i));
                            }
                            System.out.println();

                            System.out.println("Sorted by Colour:");
                            for (int i = 0; i < colourVector.size(); i++) {
                                System.out.printf("%-10s %-25s %n", copyColour.get(i), updated.get(i));
                            }
                            System.out.println();
                        }
                        default -> System.out.println("Not a choice! Try again.");
                    }
                }
                // For ArrayList
                case 2 -> {
                    System.out.println("You picked ArrayList!\n\nHere are your choices:");
                    System.out.println("[1] Sort by NAME");
                    System.out.println("[2] Sort by COLOUR");

                    System.out.print("Enter your choice >> ");
                    int choiceNested = sc.nextInt();
                    System.out.println();

                    switch (choiceNested) {
                        case 1 -> {
                            ArrayList<String> copyName = new ArrayList<>(nameArrayList);

                            // Sort copyName with Collections class method
                            Collections.sort(copyName);

                            // Sort index according to sorted copyName
                            for (int i = 0; i < nameArrayList.size(); i++) {
                                for (int j = 0; j < nameArrayList.size(); j++) {
                                    if (nameArrayList.get(j).equals(copyName.get(i))) {
                                        index[i] = j;
                                    }
                                }
                            }

                            ArrayList<String> updated = new ArrayList<>();

                            // Updating
                            for (int i = 0; i < index.length; i++) {
                                updated.add(i, colourArrayList.get(index[i]));
                            }

                            System.out.println("Original data:");
                            for (int i = 0; i < nameArrayList.size(); i++) {
                                System.out.printf("%-25s %-10s %n", nameArrayList.get(i), colourArrayList.get(i));
                            }
                            System.out.println();

                            System.out.println("Sorted by Name:");
                            for (int i = 0; i < nameArrayList.size(); i++) {
                                System.out.printf("%-25s %-10s %n", copyName.get(i), updated.get(i));
                            }
                            System.out.println();
                        }
                        case 2 -> {
                            ArrayList<String> copyColour = new ArrayList<>(colourArrayList);

                            // Sort copyColour with Collections class method
                            Collections.sort(copyColour);

                            // Sort index according to sorted copyColour
                            for (int i = 0; i < colourArrayList.size(); i++) {
                                for (int j = 0; j < colourArrayList.size(); j++) {
                                    if (colourArrayList.get(j).equals(copyColour.get(i))) {
                                        index[i] = j;
                                    }
                                }
                            }

                            ArrayList<String> updated = new ArrayList<>();

                            // Updating
                            for (int i = 0; i < index.length; i++) {
                                updated.add(i, nameArrayList.get(index[i]));
                            }

                            System.out.println("Original data:");
                            for (int i = 0; i < colourArrayList.size(); i++) {
                                System.out.printf("%-10s %-25s %n", colourArrayList.get(i), nameArrayList.get(i));
                            }
                            System.out.println();

                            System.out.println("Sorted by Colour:");
                            for (int i = 0; i < colourArrayList.size(); i++) {
                                System.out.printf("%-10s %-25s %n", copyColour.get(i), updated.get(i));
                            }
                            System.out.println();
                        }
                        default -> System.out.println("Not a choice! Try again.");
                    }
                }
                case 3 -> {
                    Object[] copy = idVector.toArray();

                    // Convert from object[] to long[]
                    Long[] copyLong = Arrays.copyOf(copy, copy.length, Long[].class);

                    // Sort with Arrays utility class
                    Arrays.sort(copyLong);

                    System.out.println("Before sorting:");
                    for (Long aLong : idVector) {
                        System.out.println(aLong);
                    }
                    System.out.println();

                    System.out.println("After sorting:");
                    for (Long bLong : copyLong) {
                        System.out.println(bLong);
                    }
                    System.out.println();
                }
                case 4 -> {
                    Object[] copy = idVector.toArray();

                    // Convert from object[] to long[]
                    Long[] copyLong = Arrays.copyOf(copy, copy.length, Long[].class);

                    System.out.print("Enter ID to check >> ");
                    long value = sc.nextLong();

                    int indexFound = -1;

                    for (int i = 0; i < copyLong.length; i++) {
                        if (value == copyLong[i]) {
                            indexFound = i;
                            break;
                        }
                    }

                    if (indexFound != -1) {
                        System.out.println("ID found at index " + indexFound);
                    } else {
                        System.out.println("ID is not in array. Returned index " + indexFound);
                    }
                    System.out.println();
                }
                case 5 -> {
                    System.out.println("Goodbye!");
                    flag = false;
                }
                default -> System.out.println("Not a choice! Try again.");
            }
        }
    }
}