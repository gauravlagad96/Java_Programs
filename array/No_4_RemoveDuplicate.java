package com.leetcode.array;

import java.util.LinkedHashSet;
import java.util.Set;

class Solution4 {
	
	public int removeDuplicates(int[] nums) {
		
		if (nums.length == 0)
			return 0;
		
		Set<Integer> set = new LinkedHashSet<>();

		for (int i = 0; i < nums.length; i++) {
			set.add(nums[i]);
		}
   
		//second loop for rewriting the set into nums;
		int i = 0;
		for (int num : set) {
			nums[i++] = num;
		}
		return set.size();
	}
}

public class No_4_RemoveDuplicate {
	public static void main(String[] args) {
		Solution4 solution4 = new Solution4();
		int arr[]= {11,22,33,33,44,44,55,55}; //ER:5
		int removeDuplicates = solution4.removeDuplicates(arr);
		
		System.out.println(removeDuplicates);
		
	}

}
