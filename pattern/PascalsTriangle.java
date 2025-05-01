package com.pattern;

public class PascalsTriangle {
    public static void main(String[] args) {
        int rows = 5; // Number of rows for Pascal's Triangle

        for (int i = 0; i < rows; i++) {
            // Print spaces for formatting
            for (int j = 0; j < rows - i; j++) {
                System.out.print(" ");
            }

            // Calculate and print numbers in the row
            int number = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(number + " ");
                number = number * (i - j) / (j + 1); // Update number using Pascal's Triangle formula
            }
            System.out.println(); // Move to the next line
        }
    }
}
