package com.leetcode.pattern;

public class No_15_HollowFullPyramid {
	public static void main(String[] args) {
		int flag = 1;
		int k = 2;
		for (int i = 1; i <= 5; i++) {
			flag = 1;
			for (int j = 1; j <= 9; j++) {
				if (j >= 6 - i && j <= 4 + i) {
					if (j == 6 - i) {
						System.out.print(flag);
						flag++;
					} else if (i == 5 && j % 2 != 0) {
						System.out.print(flag);
						flag++;
					} else if (j == 4 + i) {
						System.out.print(k);
						k++;
					} else {
						System.out.print(" ");
					}
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
