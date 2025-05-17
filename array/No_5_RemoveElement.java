package com.leetcode.array;

class Solution5 {
	public int removeElement(int[] nums, int val) {
		int k = 0; // Pointer for placing non-val elements

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != val) {
				nums[k] = nums[i];
				k++;
			}
		}
		return k;
	}
}

public class No_5_RemoveElement {

	public static void main(String[] args) {

		Solution5 solution5 = new Solution5();
		int arr[] = { 1, 1, 2, 4, 7 }; // 3
		int removeElement = solution5.removeElement(arr, 1);
		System.out.println(removeElement);
	}

}

/*
 * second way import java.util.LinkedList;
 * 
 * class Solution { public int removeElement(int[] nums, int val) {
 * LinkedList<Integer> list = new LinkedList<>();
 * 
 * // Add elements to LinkedList if they're not equal to val for (int num :
 * nums) { if (num != val) { list.add(num); } }
 * 
 * // Copy elements back to nums array (optional, depending on requirements) int
 * k = list.size(); for (int i = 0; i < k; i++) { nums[i] = list.get(i); }
 * 
 * return k; } }
 */
