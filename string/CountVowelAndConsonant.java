package com.string;

public class CountVowelAndConsonant {

	public static void main(String[] args) {

		int vowel = 0;
		int consonant = 0;

		StringBuilder str = new StringBuilder();
		str.append("asfdfe");
		System.out.println(str);
       //str.replace(1, 5, "a");  //end index not included

		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
				if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
					vowel++;
				} else {
					consonant++;
				}
			}
		}
		System.out.println("Vowel count is : " + vowel);
		System.out.println("Consonant count is : " + consonant);

	}

}
