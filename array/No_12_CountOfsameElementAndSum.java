package com.leetcode.array;

import java.util.Scanner;

public class No_12_CountOfsameElementAndSum {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int  a[]=new int[8];
		System.out.println("ente rthe element of array");
		for (int i = 0; i < a.length; i++) {
			a[i]=sc.nextInt();
		}
		
		System.out.println("the count and sum of the vareiable");
		int count,sum;
		for (int i = 0; i < a.length; i++) {
			count=1;
			sum=a[i];
			for (int j = i+1; j < a.length; j++) {
				if (a[i]==a[j] && a[i]!='/') {
					count++;
					sum=sum+a[j];
					a[j]='/';
				}
			}
			if (a[i]!='/') {
				System.out.println(a[i]+"    count = "+count+"     sum:"+sum);
			}
		}
	}
}
