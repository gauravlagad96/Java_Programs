package com.leetcode.string;

public class CountDigitAlphSpecialChar {

	public static void main(String[] args) {
		String input = "Hello123@World!";

		// Counters for alphabets, digits, and special characters
		int alphabets = 0, digits = 0, specialChars = 0;

		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);

			// Check if the character is an alphabet
			if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
				alphabets++;
			}

			// Check if the character is a digit
			else if (ch >= '0' && ch <= '9') {
				digits++;
			}
			// Otherwise, it's a special character
			else {
				specialChars++;
			}
		}

		// Display the results
		System.out.println("Total Alphabets: " + alphabets);
		System.out.println("Total Digits: " + digits);
		System.out.println("Total Special Characters: " + specialChars);
	}
}
