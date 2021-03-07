package com.company;

import java.net.SocketOption;
import java.util.Scanner;

public class AscendedExercise3 {
    public static void main(String[] args) {
        // Take 20 integer inputs from user and print.......
        int pos, neg, odd, even, zero;
        pos = neg = odd = even = zero = 0;
        int INPUTS = 20;

        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < INPUTS; i++) {
            System.out.print("Input your number [" + (i + 1) + "]: ");
            int input = scan.nextInt();

            if (input > 0) {
                pos++;
            }

            if (input < 0) {
                neg++;
            }

            if (input % 2 == 0) {
                even++;
            } else {
                odd++;
            }

            if (input == 0) {
                zero++;
            }
        }

        System.out.println("a) Positive: " + pos);
        System.out.println("b) Negative: " + neg);
        System.out.println("c) Odd: " + odd);
        System.out.println("d) Even: " + even);
        System.out.println("e) 0s: " + zero);
    }
}
