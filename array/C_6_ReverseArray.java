package com.array;

import java.util.Scanner;

//.WAP to enter the five element in array and reverse it ?
public class C_6_ReverseArray {
	public static void main(String[] args) {

//		int arr[] = { 2, 4, 5, 8, 8 }; //define and initialize.
		int arr[] = new int[5];
		System.out.println("Enter the 5 elements in an array : ");
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 5; i++) {
			arr[i] = sc.nextInt();
		}

		// array before reverse
		System.out.println("Before Reverse");
		for (int i = 0; i < 5; i++) {
			System.out.print(arr[i] + " ");
		}

		// logic of reversing array
//		for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
//			int temp = arr[i];
//			arr[i] = arr[j];
//			arr[j] = temp;
//			System.out.println("i="+i + "j="+j);
//		}
		
		

		// using while loop...
		int start = 0;
		int end = arr.length - 1;
		while (start < end) {
			// Swap the elements
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			// Move the pointers
			start++;
			end--;
		}

		// array after reverse
		System.out.println("\nAfter Reverse: ");
		for (int i = 0; i < 5; i++) {
			System.out.print(arr[i] + " ");
		}

	}

}
