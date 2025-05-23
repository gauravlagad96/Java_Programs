package com.leetcode.array;

// write a program to print the count and sum of all same element in array.
public class No_11_CountOfSameEleAndSum {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 1, 3, 4, 3, 4, 5, 1, 1, 1, 99 };

		for (int i = 0; i < arr.length; i++) {

			boolean isCheacked = false;
			for (int k = 0; k < i; k++) {
				if (arr[i] == arr[k]) {
					isCheacked = true;
				}
			}

			int count = 1;
			int sum = arr[i];

			if (!isCheacked) {
				int eleValue = 0;
				for (int j = i + 1; j < arr.length; j++) {
					if (arr[i] == arr[j]) {
						count++;
						eleValue = arr[i];
						sum += arr[j];
					}
				}
				sum = sum + eleValue;
				System.out.println("Element : " + arr[i] + "  count : " + count + " " + "sum : " + sum);
			}
		}
	}
}