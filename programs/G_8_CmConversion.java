package com.programs;
//wajp to enter length in cm and convert into meter and kilometer.

import java.util.*;

public class G_8_CmConversion {
	public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Enter the length in cm ");
	 double cm = sc.nextDouble();
	 
	 double m= cm/100;
	 double km=cm/100000;
	 System.out.println(cm +" cm = " + m + " meter and " + km +" kilometer");
			 
	}
}
