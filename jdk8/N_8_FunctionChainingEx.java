package com.jdk8;

import java.util.function.Function;

public class N_8_FunctionChainingEx {
	public static void main(String[] args) {
		Function<Integer, Integer> function1 = e -> e * e;
		Function<Integer, Integer> function2 = e -> e + e;

		Integer result1 = function1.andThen(function2).apply(2);// call function1 and then function2

		Integer result2 = function1.compose(function2).apply(2);// call function2 and then function1

		System.out.println(result1);
		System.out.println(result2);
	}

}
