package com.company;

import java.util.Scanner;

public class AscendedExercise2 {
    public static void main(String[] args) {
        // Print a square of any length using "*"s in which the interior diagonals are empty
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the desired length: ");
        int length = scan.nextInt();

        int length_mid = length - 2;
        int repeat = 0;

        if (length % 2 == 0) {
            length_mid -= 2;
            repeat += 2;
        } else {
            length_mid--;
            repeat += 1;
        }

        length_mid /= 2;

        int side_prints = length_mid + 1;

        // print beginning
        for (int i = 0; i < length; ++i) {
            System.out.print("*");
        }
        System.out.print("\n");

        // print middle
        int left_right_limit = 0;
        int middle_limit = length - 2;

        // print first stuff
        for (int j = 0; j < length_mid; ++j) {
            left_right_limit++;
            middle_limit -= 2;
            // first
            for (int k = 0; k < left_right_limit; ++k) {
                System.out.print("*");
            }
            // space
            System.out.print(" ");
            // mid
            for (int k = 0; k < middle_limit; ++k) {
                System.out.print("*");
            }
            // space
            System.out.print(" ");
            // end
            for (int k = 0; k < left_right_limit; ++k) {
                System.out.print("*");
            }
            System.out.print("\n");
        }

        // print middle parts
        for (int a = 0; a < repeat; ++a) {
            for (int b = 0; b < side_prints; ++b) {
                System.out.print("*");
            }
            for (int b = 0; b < repeat; ++b) {
                System.out.print(" ");
            }
            for (int b = 0; b < side_prints; ++b) {
                System.out.print("*");
            }
            System.out.print("\n");
        }

        // print rest stuff
        for (int j = 0; j < length_mid; ++j) {
            // first
            for (int k = 0; k < left_right_limit; ++k) {
                System.out.print("*");
            }
            // space
            System.out.print(" ");
            // mid
            for (int k = 0; k < middle_limit; ++k) {
                System.out.print("*");
            }
            // space
            System.out.print(" ");
            // end
            for (int k = 0; k < left_right_limit; ++k) {
                System.out.print("*");
            }
            System.out.print("\n");
            left_right_limit--;
            middle_limit += 2;
        }

        // print ending
        for (int i = 0; i < length; ++i) {
            System.out.print("*");
        }
        // note: optional code below
        System.out.print("\n");
    }
}