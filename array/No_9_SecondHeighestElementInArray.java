package com.leetcode.array;

public class No_9_SecondHeighestElementInArray {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 6, 8, 12, 23 };

		int first = Integer.MIN_VALUE;
		int second = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {

			if (arr[i] > first) {
				second = first;
				first = arr[i];
			} else if (arr[i] > second && arr[i] != first) {
				second = arr[i];
			}
		}
		
		if(second==Integer.MIN_VALUE) {
			System.out.println("No second Max found");
		}
		else {
			System.out.println("second max element is : "+ second);
		}
	}
}
