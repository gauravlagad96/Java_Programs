package com.array.programs;

import java.util.Scanner;

/* 
  WAP to insert the element on specified position in array ?
e.g. declare the array of size 6 and store 5 values in it and last block should be empty
a[0] a[1] a[2] a[3] a[4] a[5]
10    20   30   40   50    
Enter the index on which value want to be insert
e.g. index = 2
Enter the value which want to store on index
Value = 100
When we insert the value on index then we need to shift the values from index to next index
  */

public class InsertSpecifiedPositionApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] array = new int[6];
		System.out.println("Enter 5 elements for the array:");
		for (int i = 0; i < array.length-1; i++) {
			System.out.print("Enter element " + (i + 1) + ":");
			array[i] = sc.nextInt();
		}
		System.out.println("Enter the index where you want to insert the value (0-4): ");
		int index=sc.nextInt();
		int value = sc.nextInt();
		
		//logics of insertion
		for(int i=array.length-1; i>index;i-- ) {
			array[i]=array[i-1];
		}
		array[index]=value;
				
		System.out.println("The elements in the array are:");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}

		
	}

}
