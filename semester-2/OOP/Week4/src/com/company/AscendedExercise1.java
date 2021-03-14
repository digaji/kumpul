package com.company;

import java.util.Scanner;

public class AscendedExercise1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean flag = true;

        while (flag) {
            // Have the user input matrix sizes
            System.out.println("Enter your first matrix size: ");
            System.out.print("First row size: ");
            int sizeRow1 = sc.nextInt();
            System.out.print("First column size: ");
            int sizeColumn1 = sc.nextInt();

            System.out.println("Enter your second matrix size: ");
            System.out.print("Second row size: ");
            int sizeRow2 = sc.nextInt();
            System.out.print("Second column size: ");
            int sizeColumn2 = sc.nextInt();

            if (sizeColumn1 != sizeRow2) {
                System.out.println("Incompatible matrix sizes! Try again.");
                break;
            }

            // Enter the contents of the first matrix
            int[][] firstMatrix = new int[sizeRow1][sizeColumn1];
            for (int row = 0; row < firstMatrix.length; row++) {
                for (int column = 0; column < firstMatrix[row].length; column++) {
                    System.out.print("First matrix [" + (row + 1) + "] [" + (column + 1) + "] >> ");
                    firstMatrix[row][column] = sc.nextInt();
                    System.out.println();
                }
            }

            // Enter the contents of the second matrix
            int[][] secondMatrix = new int[sizeRow2][sizeColumn2];
            for (int row = 0; row < secondMatrix.length; row++) {
                for (int column = 0; column < secondMatrix[row].length; column++) {
                    System.out.print("Second matrix [" + (row + 1) + "] [" + (column + 1) + "] >> ");
                    secondMatrix[row][column] = sc.nextInt();
                    System.out.println();
                }
            }

            int[][] resultMatrix = new int[sizeRow1][sizeColumn2];

            // Matrix multiplication
            System.out.println("Matrix multiplication:");
            for (int row = 0; row < resultMatrix.length; row++) {   // Go through each row
                for (int column = 0; column < resultMatrix[row].length; column++) { // Go through each column
                    for (int k = 0; k < firstMatrix[row].length; k++) { // Go through all multiplication from one row
                        resultMatrix[row][column] += firstMatrix[row][k] * secondMatrix[k][column];
                    }
                    System.out.print(resultMatrix[row][column] + " ");
                }
                System.out.println();   // New line after each column
            }
            System.out.println();

            // Dot product
            int product = 0;
            System.out.println("Dot product:");
            for (int row = 0; row < resultMatrix.length; row++) {   // Go through each row
                for (int column = 0; column < resultMatrix[row].length; column++) { // Go through each column
                    for (int k = 0; k < firstMatrix[row].length; k++) { // Go through all dot product from one row
                        product += firstMatrix[row][k] * secondMatrix[k][column];
                    }
                    System.out.print(product + " ");
                    product = 0;
                }
                System.out.println();   // New line after each column
            }

            sc.close();
            flag = false;
        }
    }
}