package com.test.eight;

public class Program1 {

	public static void main(String[] args) {
		System.out.println("first program... ");
		int k;
		for (int i = 1; i <= 10; i++) {
			k = i;
			for (int j = 1; j <= 19; j++) {
				if (j <= i) {
					System.out.print(j);
				} else if (j == 19) {
					System.out.print("1");
				} else if (j >= 20 - i) {
					System.out.print(k);
					k--;
				}

				else {
					System.out.print(" ");
				}
			}

			System.out.println();
		}
	}

}
