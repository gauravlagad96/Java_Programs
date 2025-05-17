package com.leetcode.string;

import java.util.Scanner;

//Write a JAVA program to find length of a string.
public class CountLengthOfString {
	public static void main(String[] args) {
		String name;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the String : ");
		name = sc.nextLine();

		int count = 0;

		for(int i=0;i<name.length();i++) {
			count++;
		}
		
//		for (char c : name.toCharArray()) {
//			System.out.print(c); // print the input string
//            count++;    // Increment length for each character
//        }


		System.out.println("\nThe length of String is : " + count);

	}

}
