package com.leetcode.string;

// Write a JAVA program to convert uppercase string to lowercase.
public class ConvertLowerCase {
	public static void main(String[] args) {

		String str = "GAuravV";
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch >= 65 && ch <= 91) {
				ch = (char) (ch + 32);
			}
			System.out.print(ch);
		}
	}
}
