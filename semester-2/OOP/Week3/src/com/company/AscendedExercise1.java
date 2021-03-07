package com.company;

import java.util.Scanner;

public class AscendedExercise1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the desired height: ");
        int Height = scan.nextInt();

        // Right angled triangle leaning to the left
        for (int i = 0; i < Height; i++) {
            for (int j = 0; j <= i; j++) {
                if (j == i) {
                    System.out.print("*\n");
                } else {
                    System.out.print('*');
                }
            }
        }
        // Gap
        System.out.print("\n");

        // Upside down right angled triangle leaning to the right
        for (int i = 0; i < Height; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(' ');
            }
            for (int j = i; j < Height; j++) {
                    System.out.print('*');
            }
            System.out.print("\n");
        }
        // Gap
        System.out.print("\n");

        // Isosceles triangle
        int star = 1;
        int space = Height - 1;
        for (int i = 0; i < Height; i++) {
            // Start loop
            for (int j = 0; j < space; ++j) {
                System.out.print(" ");
            }
            // Middle loop
            for (int j = 0; j < star; ++j) {
                System.out.print("*");
            }
            // End loop
            for (int j = 0; j < space; ++j) {
                System.out.print(" ");
            }
            System.out.print("\n");
            star += 2;
            --space;
        }
    }
}