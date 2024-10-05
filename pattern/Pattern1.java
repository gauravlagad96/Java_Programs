package com.pattern;

/*
   *
   * *
   * * *
   * * * *
   * * *
   * *
   * 
 */
public class Pattern1 {
	
	public static void main(String[] args) {
		
		for(int i=1;i<=7;i++) { //row       i=7
			for(int j=1;j<=4;j++) {  //col  j=2
				
				if(i<=4 && i>=j) {   //row 1 to 4 
					System.out.print(j + " ");   
				}
				if(i>4 && j<=8-i) {  // row 5 to 7
					System.out.print( j + " ");  // * 
				}
				
			}
			System.out.println();
		}
	}

}
