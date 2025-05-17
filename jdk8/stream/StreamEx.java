package com.leetcode.jdk8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamEx {
	public static void main(String[] args) {
		
		// jdk 8 feature
		// process collections of data in a functional and declarative manner
		// simplify data processing
		// embrace functional programming
		// enable easy parallelism

		List<Integer> no = Arrays.asList(1, 2, 3, 4, 5, 6);
		/*
		// count no of even in this list
		int i = 0;
		for (int n : no) {
			if (n % 2 == 0)
				i++;
		}
		 System.out.println("Total odd no is : " + i); */
		
		System.out.println(no.stream().filter(x -> x % 2 == 0).count());

		//different ways to create stream();
		//1. From Collections
		List<Integer> list= Arrays.asList(1,2,3,4);
		Stream<Integer> stream1=list.stream();
		
		//2. from Arrays
		String[] arr= {"a","b","c","d"};
		Stream<String> stream2=Arrays.stream(arr);
				
		//3.Using Stream.of()
		Stream<String> stream3=Stream.of("a","b","c","d");
		
		//4.Infinite Streams
		Stream<Integer> generate=Stream.generate(()->1);
		Stream.iterate(1, x->x+1);
	}
}
