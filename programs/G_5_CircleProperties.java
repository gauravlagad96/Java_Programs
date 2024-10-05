package com.programs;

// WAJP to enter radius of circle and find it's diameter, circumference and area

import java.util.Scanner;

public class G_5_CircleProperties {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Input the radius of the circle
		System.out.print("Enter the radius of the circle: ");
		double radius = scanner.nextDouble();

		// Calculate the diameter
		double diameter = 2 * radius;

		// Calculate the circumference
		double circumference = 2 * Math.PI * radius;

		// Calculate the area
		double area = Math.PI * radius * radius;

		// Print the results
		System.out.println("Diameter of the circle: " + diameter);
		System.out.println("Circumference of the circle: " + circumference);
		System.out.println("Area of the circle: " + area);

		scanner.close();
	}

}
/*
 * 1> Diameter: Diameter=2×Radius Diameter=2×Radius
 * 
 * The diameter of the circle is twice the radius.
 * 
 * 2.>Circumference: Circumference=2×π×Radius Circumference=2×π×Radius
 * 
 * The circumference is the distance around the circle. It is calculated as
 * twice the radius times π (pi), where π (pi) is approximately 3.14159.
 * 
 * 3.>Area: Area=π×Radius2 Area=π×Radius2
 * 
 * The area of the circle is the space enclosed by the circle. It is calculated
 * as π times the square of the radius.
 */
