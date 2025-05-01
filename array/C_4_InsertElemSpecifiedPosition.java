package com.array;

import java.util.Scanner;

public class C_4_InsertElemSpecifiedPosition {

	public static void main(String[] args) {

		int arr[] = new int[6];

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 5 elements : ");
		for (int i = 0; i < 5; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.println("Printing array Elements : ");

		for (int i = 0; i < arr.length - 1; i++) {
			System.out.print(arr[i] + "  ");
		}

		// logic of inserting no at specified position.
		System.out.println("\nEnter the index and elements ! ");
		int index = sc.nextInt();
		int elem = sc.nextInt();

		for (int j = arr.length - 1; j > index; j--) {
			arr[j] = arr[j - 1];
		}

		for (int i = 0; i < arr.length; i++) {
			if (i == index) {
				arr[i] = elem;
			}
		}

		System.out.println("\nPrinting array Elements after insert : ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "  ");
		}
	}
}

/*
 * WAP to insert the element on specified position in array ? e.g. declare the
 * array of size 6 and store 5 values in it and last block should be empty a[0]
 * a[1] a[2] a[3] a[4] a[5] 10 20 30 40 50 Enter the index on which value want
 * to be insert e.g. index = 2 Enter the value which want to store on index
 * Value = 100 When we insert the value on index then we need to shift the
 * values from index to next index e.g. a[0] a[1] a[2] a[3] a[4]
 */