package com.leetcode.array;

class Solution7 {
	public int[] searchRange(int[] nums, int target) {

		int j = 0;
		int temp[] = new int[nums.length];
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == target) {
				temp[j] = i;
				j++;
			}
		}

		int []result=new int[j];
		for(int i=0;i<result.length;i++) {
			result[i]=temp[i];
		}
		return result.length!=0?result:new int[] {-1,-1};
	}
}

public class No_7_FindFirstLastPositon {
	public static void main(String[] args) {
		Solution7 solution7 = new Solution7();
		int arr[] = { 5, 7, 7, 10 };
		int target = 7;
		int[] result = solution7.searchRange(arr, target);

		for (int ele : result) {
			System.out.print(ele + " ");
		}
	}
}
