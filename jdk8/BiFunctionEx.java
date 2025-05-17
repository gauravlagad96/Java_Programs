package com.leetcode.jdk8;

import java.util.function.BiFunction;

public class BiFunctionEx {
	public static void main(String[] args) {
		BiFunction<Integer, Integer, Integer> bfun = (no1, no2) -> {

			return no1 * no2;
		};

		Integer result = bfun.apply(34, 10);
		System.out.println(result);
	
	
	}

}
