package com.leetcode.array;

import java.util.Scanner;

//WAP to enter the five elements in array and find out the maximum and minimum elements
public class C_3_FindMaxMinElem {
	public static void main(String[] args) {

		int arr[] = new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 5 elements in array : ");
		for (int i = 0; i < 5; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.println("Printing array Elements : ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "  ");
		}

		// find min and max elements logics
		int min = arr[0];
		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (min >= arr[i]) {
				min = arr[i];
			}
			if (max < arr[i]) {
				max = arr[i];
			}
		}
		System.out.print("\nThe min elements in array is : " + min);
		System.out.print("\nThe max elements in array is : " + max);

	}

}
