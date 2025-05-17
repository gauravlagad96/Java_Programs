package com.leetcode.array;

class Solution6 {
	public int maxArea(int[] height) {
		int maxArea = 0;
		int minHeight = 0;
		int width;

		for (int i = 0; i < height.length; i++) {
			for (int j = height.length - 1; j > i; j--) {
				// System.out.println(i + " : " + height[i] + " " + j + " : " + height[j]);
				width = j - i;
				minHeight = height[i] > height[j] ? height[j] : height[i];

				// System.out.println(" width:" + width + " " + "height: " + minHeight);

				int area = width * minHeight;

				if (maxArea < area) {
					maxArea = area;
				}
			}
			// System.out.println("------------------" + maxArea);
		}
		return maxArea;
	}
}

public class No_6_ContainerWithMostWater {
	public static void main(String[] args) {
		Solution6 solution6 = new Solution6();

		int arr[] = { 1, 8, 8, 1, 8 };
		int result = solution6.maxArea(arr);
		System.out.println(result);
	}

}
