package com.leetcode.string;

//Write a JAVA program to concatenate two strings.
public class ConcateTwoStrings {
	public static void main(String[] args) {

//		String str1="gaurav";
//		String str2="lagad";
//		String str=str1 + " " + str2;
//		System.out.println(str);

		String str1 = "Hello";
		String str2 = "World";
		// Concatenating using concat() method
		String result = str1.concat(" " + str2);
		System.out.println(result); // Output: Hello World

	}
}
