package com.leetcode.array;

public class No_10_SortArrayDescOrder {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 6, 8, 12, 23 };

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] > arr[i]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}

		System.out.println("Array After sorting : ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}
}
