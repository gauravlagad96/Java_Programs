package com.leetcode.string;

import java.util.Vector;

public class No_2_StringJoinMethod {
	public static void main(String[] args) {
		// Step 1: Create a Vector of strings
		Vector<String> fruits = new Vector<>();
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Cherry");

		// Step 2: Use String.join to concatenate elements with a delimiter
		// Parameters:
		// - ", " is the delimiter (separator between elements)
		// - fruits is the Vector of strings to join
		String result = String.join(", ", fruits);

		// Step 3: Print the result
		System.out.println("Joined String: " + result); // Output: Joined String: Apple, Banana, Cherry
	}
}

//What is String.join?

//The String.join method is a static method introduced in Java 8 as part of the String class.

//It is used to concatenate multiple strings (or elements of a collection) into a single string, with a specified delimiter (e.g., a comma, space, or any other character/string) between the elements.

//Syntax of String.join

//There are two overloaded versions of the String.join method:

//1.For an Iterable (e.g., Vector, List, etc.):
//String joinedString = String.join(CharSequence delimiter, Iterable<? extends CharSequence> elements);

//2.For an Array
//String joinedString = String.join(CharSequence delimiter, CharSequence... elements);

//Parameters:

// 1)delimiter:

//        The character or string that will be used to separate the elements in the final concatenated string.
//        Example: ", ", " - ", " ", etc.

// 2)elements:
//
//        The collection (e.g., Vector, List, etc.) or array of elements to be joined.
//
//        The elements must be of type CharSequence (e.g., String, StringBuilder, etc.).

//Return Value:
//            The method returns a new string that consists of the elements of the collection or array, separated by the specified delimiter.