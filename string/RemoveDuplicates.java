package com.leetcode.string;

public class RemoveDuplicates {

	public static void main(String[] args) {
		
		String str = "iamfinefine";
		String result = "";

		for (int i = 0; i < str.length(); i++) {
			char current = str.charAt(i);

			boolean con = false;

			for (int j = 0; j < result.length(); j++) {

				if (current == result.charAt(j) ) {
					con = true;
					break;
				}
			}
			
			if(!con) {
				result+=current;
			}
		}
		
		System.out.println("original String : " + str);
		System.out.println("After remove duplicate : " + result);
	}
}
