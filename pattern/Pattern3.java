package com.pattern;

//8*9
public class Pattern3 {
	public static void main(String[] args) {
		
		for(int i=1;i<=8;i++) {
			for(int j=1;j<=8;j++) {
				if(i==1 || j==1 || j==8 || i==8 || i==j ||j==9-i)
					System.out.print(" *");
				else
					System.out.print("  ");
				
			}
			System.out.println();
		}
	}

}
