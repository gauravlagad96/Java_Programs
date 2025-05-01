package com.pattern;

public class No_16_NoHollowInvertedHalfPyramid {
	public static void main(String[] args) {
		
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=6-i;j++) {
				
				 if(i==1) {
					System.out.print(j + " ");
				}
				else if(j==1) {
					System.out.print(i);
				}
				else if(j==6-i) {
					System.out.print(" 5");
				}
				else {
					System.out.print("  ");
				}
				 
			}
			System.out.println();
		}
	}

}
