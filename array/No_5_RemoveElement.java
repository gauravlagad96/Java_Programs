package com.leetcode.array;

import java.util.Iterator;
import java.util.Scanner;

public class No_5_RemoveElement {

	public static void main(String[] args) {
		int arr[] = new int[5];
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter 5 elements");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.println("The given elements are : ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

		System.out.println("\nEnter which element you want to remove in array : ");
		int element = sc.nextInt();

		int uniqueArr[] = new int[5];
		int j = 0;
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != element) {
				uniqueArr[j] = arr[i];
				j++;
				count++;
			}
		}

		System.out.println("Array After removed the specific elemnts");
		for (int i = 0; i < count; i++) {
			System.out.print(uniqueArr[i] + " ");
		}

	}

}
