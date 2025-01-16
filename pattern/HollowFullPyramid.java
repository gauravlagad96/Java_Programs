package com.pattern;

public class HollowFullPyramid {

	public static void main(String[] args) {

		for (int i = 1; i <= 6; i++) {
			for (int j = 1; j <= 11; j++) {

				if (j == 7 - i || j == 5 + i || (i==6 && j%2!=0)) {
					System.out.print(" *");
				}
				
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}



