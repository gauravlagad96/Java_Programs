package com.leetcode.jdk8;

import java.util.function.Predicate;

public class N_2_PredicateEx {

	public static void main(String[] args) {
//		Predicate<Integer> isEvenNo = (no) -> {
//			if (no % 2 == 0)
//				return true;
//			else
//				return false;
//		};

		// shorthand of above code
		Predicate<Integer> isEvenNo = no -> no % 2 == 0;
		System.out.println(isEvenNo.test(21));
	}
}
//cheack if the no is even or not using predicate Functional interface