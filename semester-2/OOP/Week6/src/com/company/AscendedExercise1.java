package com.company;

public class AscendedExercise1 {
    public static void main(String[] args) {
        for (int i = 1; i <= 500; i++) {
            if (primeChecker(i)) {
                System.out.println(i + " is prime");
            } else {
                System.out.println(i + " is not prime");
            }
        }
    }

    private static boolean primeChecker(int number) {
        if (number <= 1) {
            return false;
        }

        if (number == 2) {
            return true;
        }

        if (number % 2 == 0) {
            return false;
        }

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
