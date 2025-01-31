package com.pattern;

public class Pattern2 {

	public static void main(String[] args) {

		int cout =1;
		
		for (int i = 1; i <= 3; i++) {
			for (int j = 1; j <= 10; j++) {
				if (j <= 5) {
					System.out.print(cout);
					cout++;
				}
				if (j>5) {
					System.out.print("*");
					cout--;
				}
			}
			System.out.println();
			cout = cout +10;
		}
	}
}
