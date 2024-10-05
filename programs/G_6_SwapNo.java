package com.programs;
import java.util.*;
public class G_6_SwapNo {
	public static void main(String[] args) {
		int a,b,c;
		System.out.println("Enter the two no: \n");
		Scanner sc = new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		
		System.out.println("before swap:\n" + a +"  " + b);

		c=a;
		a=b;
		b=c;
		System.out.println("after swap:\n" + a +"  " + b);
		
	}

}
