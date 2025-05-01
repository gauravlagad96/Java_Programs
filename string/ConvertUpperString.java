package com.string;

//Write a JAVA program to convert uppercase string to lowercase.
public class ConvertUpperString {
	public static void main(String[] args) {
		String name = "gaurav";
//		String upperCase = name.toUpperCase();
//		System.out.println(upperCase);

		for (int i = 0; i < name.length(); i++) {
			char ch = name.charAt(i);

			if (ch >= 'a' && ch <= 'z') {
				ch = (char) (ch - 32);
			}
			System.out.print(ch);
		}
	}

}
