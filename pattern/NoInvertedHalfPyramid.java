package com.leetcode.pattern;

//5*5
public class NoInvertedHalfPyramid {

	public static void main(String[] args) {

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 6 - i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}

//		for(int i=1;i<=6;i++) {
//			for(int j=1;j<=6;j++) {
//				if(j<=6-i) {
//					System.out.print(j + " ");
//				}
//			}
//			System.out.println();
//		}

		
	}
}
