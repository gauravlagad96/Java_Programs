package com.leetcode.array;

import java.util.Scanner;

public class C_5_MissingElements {
	public static void main(String[] args) {

		int arr[] = new int[5];

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 5 elements in ascending order e.g 1 3 5 ... : ");
		for (int i = 0; i < 5; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.println("Printing array Elements : ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "  ");
		}

		System.out.println(" \nMissing array elements are : ");

		// Find missing elements
		for (int i = 0; i < arr.length - 1; i++) {
			// Check for gaps between consecutive elements
			for (int j = arr[i] + 1; j < arr[i + 1]; j++) { // arr[i]+1=11+1 (arr[0]) && arr[i+1]=arr[1]
				System.out.print(j + " ");
			}
		}

	}

}
