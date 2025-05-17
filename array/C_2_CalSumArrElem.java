package com.leetcode.array;

import java.util.Scanner;

public class C_2_CalSumArrElem {

	public static void main(String[] args) {

		int arr[] = new int[5];

		// input 5 elements using Scanner class.
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 5 elements : ");
		for (int i = 0; i < 5; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.println("array Elements are : ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "  ");
		}
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}
		System.out.println("\nThe sum of all array elements are : " + sum);
	}
}
