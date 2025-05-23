package com.leetcode.array;

public class No_8_PrintDuplicateFromArray {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 1, 4, 0,1,1 ,2,2}; // You can change this to any 5 values

		System.out.println("Duplicate elements are:");

		for (int i = 0; i < arr.length; i++) {
			boolean alreadyChecked = false;

			// Check if current element is already checked
			for (int k = 0; k < i; k++) {
				if (arr[i] == arr[k]) {
					alreadyChecked = true;
					break;
				}
			}

			// If not already checked, check if it's a duplicate
			if (!alreadyChecked) {
				for (int j = i + 1; j < arr.length; j++) {
					if (arr[i] == arr[j]) {
						System.out.println(arr[i]);
						break; // Print only once
					}
				}
			}
		}
	}
}
