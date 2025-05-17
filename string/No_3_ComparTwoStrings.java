package com.leetcode.string;

//Write a JAVA program to compare two strings
public class No_3_ComparTwoStrings {

	public static void main(String[] args) {
		String str1 = "hello";
		String str2 = "world";
		String str3 = "hello";

		if (str1 == str2)
			System.out.println("str1 and str2 are equals !");
		else if (str2 == str3)
			System.out.println("str2 and str3 are equals");
		else if (str1 == str3) {
			System.out.println("str1 and str3 are equals !");
		}

	}

}
