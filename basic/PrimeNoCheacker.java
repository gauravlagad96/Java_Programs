package com.basic;

import java.util.Scanner;

//wajp to cheack the no is prime or not if prime print that no if not print previous and next prime no..

public class PrimeNoCheacker {
	public static void main(String[] args) {
		System.out.println("enter the number: ");
		Scanner sc = new Scanner(System.in);
		int no = sc.nextInt();

		int count = 0;
		for (int i = 1; i <= no; i++) {
			if (no % i == 0) {
				count++;
			}
		}
		if (count <= 2) {
			System.out.println(no + " is prime no !");
		} else {
			System.out.println(no + " is not prime no ");
		}
	}

}
