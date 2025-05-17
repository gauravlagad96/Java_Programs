package com.leetcode.array;

// WAP to reverse an array
public class C_6_ReverseArray {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5 }; // Defined and initialized array

		// Array before reverse
		System.out.println("Before Reverse:");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

		// Logic of reversing array using two separate for loops
		int temp;
		for (int i = 0; i < arr.length / 2; i++) {
			int j = arr.length - 1 - i;
			temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}

		// after reverse
		System.out.println("\nAfter Reverse:");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
