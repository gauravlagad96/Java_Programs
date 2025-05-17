package com.leetcode.pattern;

public class No_14_NoFullPyramid {
	
	public static void main(String[] args) {

		int flag1=0;
		for (int i = 1; i <= 5; i++) {
			int flag = i;
			for (int j = 1; j <= 9; j++) {
				if (j >= 6 - i && j <= 4 + i) {
					if (j <= 5) {
						System.out.print(flag);
						flag++;
						flag1=flag-1;
					} 
					if(j>=6){
						flag1--;
						System.out.print(flag1);
					}
				} 
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}

