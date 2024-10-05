package com.array.programs;

import java.util.Scanner;

public class AscendingOrderApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[]=new int[5];
		System.out.println("Enter 5 elements in an array");
		for (int i = 0; i < 5; i++)
			arr[i] = sc.nextInt();
		
		System.out.println("before shorting:");
		for(int arrays:arr) {
			System.out.print(arrays + " ");
		}
		
//		int temp;
		for(int i=0;i<arr.length;i++) {
			
			for(int j=i+1;j<arr.length;j++) {
				if (arr[i]<arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println("\nAfter shorting:");
		for(int arrays:arr) {
			System.out.print(arrays + " ");
		}
	}

}
