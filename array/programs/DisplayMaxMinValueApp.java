package com.array.programs;

import java.util.Scanner;

public class DisplayMaxMinValueApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numbers[] = new int[5];

		System.out.println("Enter the 5 elements in an array: ");

		for (int i = 0; i < 5; i++) {
			numbers[i] = sc.nextInt();
		}

		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;

		for (int i = 0; i < 5; i++) {
			if (max < numbers[i]) {
				max = numbers[i];
			}
			if (min> numbers[i]) {
				min = numbers[i];
			}
		}

		System.out.println("The max value in array is: " + max);
		System.out.println("The min value in array is: " + min);

		sc.close();
	}

}

/*
 * WAP to enter the five elements in array and find out the maximum and minimum
 * elements a[0] a[1] a[2] a[3] a[4] Output like as Maximum element in array :11
 * Minimum element in array : 4
 * 
 */
