package com.leetcode.array;

import java.util.Scanner;

public class No_1_Problem1BinarayArray {
	public static void main(String[] args) {
		int arr[] = new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 5 elements in an array: ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Array Elements are : ");
		for (int elements : arr) {
			System.out.print(elements);
		}
		
		
	

	}

}

/*
 
 
 */
