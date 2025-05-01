package com.pattern;

public class NoHollowFullPyramid {
	public static void main(String[] args) {

		int k = 1;
		int num = 1;
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 9; j++) {
				if (j == 6 - i || j == 4 + i || (i == 5 && j % 2 != 0)) {
					if (j == 6 - i) {
						System.out.print("1");
					} else if (j == 4 + i) {
						++k;
						System.out.print(k);
					} else if (i == 5 && j % 2 != 0) {
						num++;
						System.out.print(num);
					}

				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
