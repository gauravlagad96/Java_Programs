package com.array;

import java.util.Scanner;

//1) WAP to enter the five elements in array and show it
public class C_1_InputArrayElem {
	public static void main(String[] args) {

		int arr[] = new int[5];

		//input array logic
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 5 elements : ");
		for (int i = 0; i < 5; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.println("Printing array Elements : ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "  ");
		}
	}
}
