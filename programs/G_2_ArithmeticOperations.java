package com.programs;

import java.util.Scanner;

public class G_2_ArithmeticOperations {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Input two numbers
		System.out.print("Enter the first number: ");
		double num1 = scanner.nextDouble();

		System.out.print("Enter the second number: ");
		double num2 = scanner.nextDouble();

		// Perform arithmetic operations
		double sum = num1 + num2;
		double difference = num1 - num2;
		double product = num1 * num2;
		double quotient = 0;
		double modulus = 0; // remainder

		// Handling division and modulus by zero
		if (num2 != 0) {
			quotient = num1 / num2;
			modulus = num1 % num2;
		} else {
			System.out.println("Division and modulus by zero are undefined.");
		}

		// Print results
		System.out.println("Sum: " + sum);
		System.out.println("Difference: " + difference);
		System.out.println("Product: " + product);
		
		if (num2 != 0) {
			System.out.println("Quotient: " + quotient);
			System.out.println("Modulus: " + modulus);
		}

	}

}

/*
 * The term "quotient" refers to the result of a division operation. When you
 * divide one number by another, the quotient is the number of times the divisor
 * fits into the dividend.
 */
