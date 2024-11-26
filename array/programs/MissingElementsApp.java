package com.array.programs;
/* 
Write a program to enter the 5 values in ascending order and store in array and find out the 
missing element from array?

a[0] a[1] a[2] a[3] a[4]
1 	   5	9 	13 	 17
Missing elements : output should like as
2 3 4 6 7 8 10 11 12 14 15 16

*/

import java.util.Scanner;

public class MissingElementsApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		
		System.out.println("Enter 5 elements in an array");
		for (int i = 0; i < 5; i++)
			arr[i] = sc.nextInt();

		System.out.println("array elements are: ");
		for (int ele : arr)
			System.out.print(ele + " ");

		// sort the array
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i]>arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println("\nsorted array: ");
		for (int ele : arr)
			System.out.print(ele + " ");
		
		//Missing Elements logic.
		for(int i=0;i<arr.length-1;i++) {
			
		}
		
	}

}
