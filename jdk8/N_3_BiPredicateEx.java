package com.jdk8;

import java.util.function.BiPredicate;

public class N_3_BiPredicateEx {
	public static void main(String[] args) {
		BiPredicate<String, Integer> biPredicate = (x, y) -> x.length() == y;

		boolean result = biPredicate.test("Name", 46);
		System.out.println(result);
	}

}
