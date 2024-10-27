package com.assignment;

import java.util.function.Function;

public class FunctionalInterfaceApp {
	public static void main(String[] args) {
		Function<Integer, Integer> cube = x -> x * x * x;
		int number = 3;
		System.out.println("Cube of " + number + " is: " + cube.apply(number));
	}
}

// set A - D