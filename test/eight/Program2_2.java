package com.test.eight;

import java.util.Scanner;

interface ArrayOperation {
	void acceptArray(int a[], int b[]);

	int[] getResult();
}

class MergeArray implements ArrayOperation {

	int c[] = new int[10];

	@Override
	public void acceptArray(int[] a, int[] b) {

		for (int i = 0; i < 5; i++) {
			c[i] = a[i];
		}
		for (int i = 5; i <= 9; i++) {
			c[i] = b[i - 5];
		}

	}

	@Override
	public int[] getResult() {
		System.out.println("\nAfter Merg array:");
		for (int i = 0; i < c.length; i++) {
			System.out.print(c[i] + " ");
		}
		System.out.println();
		return c;
	}
}

class UnionOfArray implements ArrayOperation {
	int[] c = new int[20];
	int index = 0; // Index to track the position in result array

	@Override
	public void acceptArray(int[] a, int[] b) {
		// Add all elements from the first array to the result
		for (int i = 0; i < a.length; i++) {
			if (!isPresent(c, index, a[i])) { // Avoid duplicates
				c[index++] = a[i];
			}
		}

		// Add elements from the second array if not already present
		for (int i = 0; i < b.length; i++) {
			if (!isPresent(c, index, b[i])) { // Avoid duplicates
				c[index++] = b[i];
			}
		}
	}

	@Override
	public int[] getResult() {
		System.out.println("\nUnion of Arrays:");
		for (int i = 0; i < index; i++) {
			System.out.print(c[i] + " ");
		}
		System.out.println();
		// Return the result array trimmed
		int[] result = new int[index];
		for (int i = 0; i < index; i++) {
			result[i] = c[i];
		}
		return result;
	}

	// Helper method to cheack
	private boolean isPresent(int[] array, int size, int element) {
		for (int i = 0; i < size; i++) {
			if (array[i] == element) {
				return true;
			}
		}
		return false;
	}
}

public class Program2_2 {

	public static void main(String[] args) {
		boolean flag = true;

		do {
			Scanner sc = new Scanner(System.in);

			System.out.println("Enter 1 for Merge two array\n2 for Uninon array \n 3 for exit");
			System.out.println("Enter your choice : ");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				ArrayOperation arr = new MergeArray();
				int arr1[] = new int[5];
				int arr2[] = new int[5];

				System.out.println("Enter 5 element in an arr1 : ");
				for (int i = 0; i < 5; i++) {
					arr1[i] = sc.nextInt();
				}

				System.out.println("Enter 5 element in an arr2 : ");
				for (int i = 0; i < 5; i++) {
					arr2[i] = sc.nextInt();
				}
				arr.acceptArray(arr1, arr2);
				arr.getResult();
				break;
			case 2:
				ArrayOperation unionOfArray = new UnionOfArray();
				int uarr1[] = new int[5];
				int uarr2[] = new int[5];

				System.out.println("Enter 5 element in an arr1 : ");
				for (int i = 0; i < 5; i++) {
					uarr1[i] = sc.nextInt();
				}

				System.out.println("Enter 5 element in an arr2 : ");
				for (int i = 0; i < 5; i++) {
					uarr2[i] = sc.nextInt();
				}
				unionOfArray.acceptArray(uarr1, uarr2);
				unionOfArray.getResult();
				break;

			case 3:
				flag = false;
				System.out.println("Exit successfully..!");
				System.exit(choice);
				break;

			default:
				break;
			}
		} while (flag);

	}
}
