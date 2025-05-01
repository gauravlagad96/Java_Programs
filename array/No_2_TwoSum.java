package com.leetcode.array;

import java.util.Arrays;

class Solution {
	public int[] twoSum(int[] nums, int target) {
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] + nums[j] == target) {
					return new int[] { i, j };
				}
			}
		}
		return new int[] {};
	}
}

public class No_2_TwoSum {

	public static void main(String[] args) {

		Solution s = new Solution();
		int[] arr = { 1, 3, 2, 7, 9, 8 };
		int target = 9;
		int[] twoSum = s.twoSum(arr, target) ;
		
        System.out.println(Arrays.toString(twoSum)); // Correct way to print
	}

}
