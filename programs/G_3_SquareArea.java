package com.programs;

/**
 * WAJP to enter side of square and find it's area.
 * Formulea:-> Area of Square = side * side
 */

import java.util.Scanner;

public class G_3_SquareArea {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Input the length of a side of the square
		System.out.print("Enter the length of a side of the square: ");
		double side = scanner.nextDouble();

		// Calculate the area
		double area = side * side;

		// Print the area
		System.out.println("The area of the square is: " + area);

		scanner.close();
	}
}
