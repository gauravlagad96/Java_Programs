package com.leetcode.array;

import java.util.HashSet;
import java.util.Set;

class Solution3 {
	
	public int lengthOfLongestSubstring(String s) {
		Set<Character> set = new HashSet<>(); // to store unique characters

		int left = 0, right = 0; // two pointers
		int maxLength = 0; // to store the maximum length found

		while (right < s.length()) { // move right pointer till end
			if (!set.contains(s.charAt(right))) { // if character not in set
				set.add(s.charAt(right)); // add character to set
				maxLength = Math.max(maxLength, right - left + 1); // update maximum length
				right++; // move right pointer
			} else {
				set.remove(s.charAt(left)); // remove character from left side
				left++; // move left pointer
			}
		}

		return maxLength; // finally return the answer
	}
}

public class No_3_LengthOfLongestSubstring {
	public static void main(String[] args) {
		Solution3 s=new Solution3();
		
		int longestSubstring = s.lengthOfLongestSubstring("Gaurav");
		System.out.println(longestSubstring);
		
	}
	
	

}
