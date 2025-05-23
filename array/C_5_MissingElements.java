package com.leetcode.array;

import java.util.Scanner;

public class C_5_MissingElements {
	public static void main(String[] args) {

		int arr[] = new int[5];

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 5 elements in array !!! ");
		for (int i = 0; i < 5; i++) {
			arr[i] = sc.nextInt();
		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[i]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}

		// missing element logic
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = arr[i] + 1; j < arr[i + 1]; j++) {
				System.out.print(j + " ");
			}
		}
	}
}
