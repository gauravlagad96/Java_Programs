package com.leetcode.string;

//Write a JAVA program to copy one string to another string.
public class CopyString {

	public static void main(String[] args) {

		// first way
//		String str1="gaurav";
//		String str2="";
//		str2=str1;
//		System.out.println(str1);

		// 2nd waay
		String str1 = "gaurav";
		String str2 = "";
		// Copying str1 to str2 using copyValueOf
		str2 = String.copyValueOf(str1.toCharArray());
		// Printing the copied string
		System.out.println("str2 after copying: " + str2);
	}
}
