package com.iterable;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;

public class N_0_IterableInterfaceMethods {
	
	public static void main(String[] args) {
		// Create a List (which implements Iterable)
		List<String> fruits = Arrays.asList("Apple", "Banana", "Cherry");

		// 1. Using iterator() - Returns an Iterator to traverse the elements
		System.out.println("Using iterator():");
		Iterator<String> iterator = fruits.iterator(); // Get an Iterator for the list
		while (iterator.hasNext()) { // Check if there are more elements
			String fruit = iterator.next(); // Get the next element
			System.out.println(fruit); // Print the element
		}

		// 2. Using forEach() - Performs an action for each element
		System.out.println("\nUsing forEach():");
		fruits.forEach(fruit -> System.out.println(fruit)); // Print each element using forEach

		// 3. Using spliterator() - Returns a Spliterator for traversing and
		// partitioning elements
		System.out.println("\nUsing spliterator():");
		Spliterator<String> spliterator = fruits.spliterator(); // Get a Spliterator for the list
		spliterator.forEachRemaining(System.out::println); // Print remaining elements using forEachRemaining
	}
}

//Key Points:
//1. The Iterable interface has one abstract method: iterator().
//2. It also includes two default methods: forEach() and spliterator() (introduced in Java 8).
//3. All collection classes in the Java Collections Framework implement Iterable.
//4. Iterable enables collections to be traversed using iterators or for-each loops.