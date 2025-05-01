package com.jdk8;

import java.util.function.Function;

public class N_6_FunctionEx {
	public static void main(String[] args) {

		Function<String, Integer> func = e -> e.length();
		Integer result = func.apply("gaurav lagad");
		System.out.println(result);	
	}
}
