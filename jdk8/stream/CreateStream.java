package com.leetcode.jdk8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class CreateStream {
	public static void main(String[] args) {
		// different ways to create stream();
		// 1. From Collections
		List<Integer> list = Arrays.asList(1, 2, 3, 4);
		Stream<Integer> stream1 = list.stream();

		// 2. from Arrays
		String[] arr = { "a", "b", "c", "d" };
		Stream<String> stream2 = Arrays.stream(arr);

		// 3.Using Stream.of()
		Stream<String> stream3 = Stream.of("a", "b", "c", "d");

		// 4.Infinite Streams
		Stream<Integer> generate = Stream.generate(() -> 1);
		Stream.iterate(1, x -> x + 1);
	}

}
