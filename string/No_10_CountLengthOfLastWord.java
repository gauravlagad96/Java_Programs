package com.leetcode.string;

//count length of last word 
public class No_10_CountLengthOfLastWord {
	public static void main(String[] args) {

		String str = "java is object oriented programmin language";
		str.trim();
		int count = 0;
		for (int i = str.length() - 1; i >= 0; i--) {
			char c = str.charAt(i);
			if (c != ' ') {
				count++;
			} else
				break;
		}

		System.out.println("count of last word is : " + count);
	}

}
