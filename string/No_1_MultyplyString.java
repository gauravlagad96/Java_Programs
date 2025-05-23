package com.leetcode.string;

class Solution {

	public String multiply(String num1, String num2) {
		int no = 0;
		int no1 = 0;
		for (int i = 0; i < num1.length(); i++) {
			no = no * 10 + num1.charAt(i) - 48;
		}

		for (int i = 0; i < num2.length(); i++) {
			no1 = no1 * 10 + num2.charAt(i) - 48;
		}

		//System.out.println(no + "  " + no1);
		no = no * no1;
		return Integer.toString(no);
	}
}

public class No_1_MultyplyString {
	public static void main(String[] args) {
		Solution s1 = new Solution();

		String multiply = s1.multiply("106", "10");
		System.out.println(multiply);
	}
}
