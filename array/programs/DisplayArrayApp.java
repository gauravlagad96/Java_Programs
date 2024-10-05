package com.array.programs;

import java.util.Scanner;

public class DisplayArrayApp {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int[] array = new int[5];

		System.out.println("Enter 5 elements for the array:");
		for (int i = 0; i < array.length; i++) {
			System.out.print("Enter element " + (i + 1) + ":");
			array[i] = scanner.nextInt();
		}
//	        method 1
		System.out.println("The elements in the array are:");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}

//	    method 2
		System.out.println("\nprint array elements using for each loop: ");
		for (int i : array) {
			System.out.print(i + " ");
		}
		scanner.close();
	}
}
