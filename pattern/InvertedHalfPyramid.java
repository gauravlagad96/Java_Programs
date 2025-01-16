package com.pattern;

//6*6
public class InvertedHalfPyramid {
	public static void main(String[] args) {

		for (int i =1; i<=6; i++) {
			
			for (int j =1; j<=6;j++) {

				if (j<=7-i) {
					System.out.print(" *");
				}
			}
			System.out.println();
		}
	}

}
