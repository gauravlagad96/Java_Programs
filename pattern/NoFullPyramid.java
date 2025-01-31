package com.pattern;

public class NoFullPyramid {
	public static void main(String[] args) {

		for (int i = 1; i <= 5; i++) {
			int flag = i;
			for (int j = 1; j <= 9; j++) {
				if (j >= 6 - i && j <= 4 + i) {
					System.out.print(flag);
					if(j<=5) {
						flag++;
					}else {
						flag--;
					}
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}	}
}

/*
    1    
   234   
  34565  
 4567876 
5678910987

*/
