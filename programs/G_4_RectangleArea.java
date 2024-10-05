package com.programs;

import java.util.Scanner;

/**
 * wajp to enter length and breadth of a reactange and find it's area.
 * 
 * Formulea:-> Area Of Reactangle = length * breadth
 */
public class G_4_RectangleArea {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Input the length of the rectangle
		System.out.print("Enter the length of the rectangle: ");
		double length = scanner.nextDouble();

		// Input the breadth of the rectangle
		System.out.print("Enter the breadth of the rectangle: ");
		double breadth = scanner.nextDouble();

		// Calculate the area
		double area = length * breadth;

		// Print the area
		System.out.println("The area of the rectangle is: " + area);

		scanner.close();

	}
}

/**
 * what is reactangle ->
 * 
 * A rectangle is a geometric shape with four sides and four right angles (90
 * degrees each). It is a type of quadrilateral, which means it has four sides.
 * The opposite sides of a rectangle are equal in length and parallel to each
 * other. Here are some key properties and characteristics of rectangles:
 */