package com.collection.list.vector;

import java.util.Vector;
import java.util.function.Consumer;

import java.util.Arrays;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class N_3_DiffWayToPrintVector {
	public static void main(String[] args) {
		// Create a Vector and add elements
		Vector<Integer> vector = new Vector<>();
		vector.add(10);
		vector.add(20);
		vector.add(30);

		// 1. Using System.out.println (Direct Printing)
		// This calls the toString() method of the Vector class, which returns a string
		// representation of the vector.
		System.out.println("1. Direct Printing: " + vector); // Output: [10, 20, 30]

		// 2. Using a for Loop
		// Iterate over the vector using an index-based loop and print each element.
		System.out.print("2. Using for Loop: ");
		for (int i = 0; i < vector.size(); i++) {
			System.out.print(vector.get(i) + " "); // Output: 10 20 30
		}
		System.out.println();

		// 3. Using an Enhanced for Loop (for-each Loop)
		// Iterate over the vector using a for-each loop and print each element.
		System.out.print("3. Using Enhanced for Loop: ");
		for (Integer element : vector) {
			System.out.print(element + " "); // Output: 10 20 30
		}
		System.out.println();

		// 4. Using Iterator
		// Use an Iterator to traverse the vector and print each element.
		System.out.print("4. Using Iterator: ");
		Iterator<Integer> iterator = vector.iterator();
		while (iterator.hasNext()) {
			System.out.print(iterator.next() + " "); // Output: 10 20 30
		}
		System.out.println();

		// 5. Using ListIterator
		// Use a ListIterator to traverse the vector and print each element.
		System.out.print("5. Using ListIterator: ");
		ListIterator<Integer> listIterator = vector.listIterator();
		while (listIterator.hasNext()) {
			System.out.print(listIterator.next() + " "); // Output: 10 20 30
		}
		System.out.println();

		// 6. Using forEach Method (Java 8+)
		// Use the forEach method to iterate over the vector and print each element.
		System.out.print("6. Using forEach Method: ");
		vector.forEach(element -> System.out.print(element + " ")); // Output: 10 20 30
		System.out.println();

		// 7. Using Streams (Java 8+)
		// Use the Stream API to iterate over the vector and print each element.
		System.out.print("7. Using Streams: ");
		vector.stream().forEach(element -> System.out.print(element + " ")); // Output: 10 20 30
		System.out.println();

		// 8. Using Enumeration
		// Use an Enumeration to traverse the vector and print each element.
		System.out.print("8. Using Enumeration: ");
		Enumeration<Integer> enumeration = vector.elements();
		while (enumeration.hasMoreElements()) {
			System.out.print(enumeration.nextElement() + " "); // Output: 10 20 30
		}
		System.out.println();

		// 9. Using Arrays.toString (Convert Vector to Array)
		// Convert the vector to an array and use Arrays.toString to print the elements.
		System.out.print("9. Using Arrays.toString: ");
		Integer[] array = vector.toArray(new Integer[0]);
		System.out.println(Arrays.toString(array)); // Output: [10, 20, 30]

		// 10. Using String.join (Convert Vector to String)
		// Convert the vector elements to a string using String.join (for
		// Vector<String>).
		Vector<String> stringVector = new Vector<>();
		stringVector.add("A");
		stringVector.add("B");
		stringVector.add("C");
		System.out.print("10. Using String.join: ");
		String result = String.join(", ", stringVector);
		System.out.println(result); // Output: A, B, C
	}
}

// Explanation of Each Method:

//Direct Printing (System.out.println(vector)):
//
//    Calls the toString() method of the Vector class, which returns a string representation of the vector.
//
//Using a for Loop:
//    Iterates over the vector using an index-based loop and prints each element.
//
//Using an Enhanced for Loop:
//    Iterates over the vector using a for-each loop and prints each element.
//Using Iterator:
//
//    Uses an Iterator to traverse the vector and print each element.
//
//Using ListIterator:
//    Uses a ListIterator to traverse the vector and print each element.
//
//Using forEach Method:
//    Uses the forEach method (introduced in Java 8) to iterate over the vector and print each element.
//
//Using Streams:
//    Uses the Stream API (introduced in Java 8) to iterate over the vector and print each element.
//
//Using Enumeration:
//    Uses an Enumeration to traverse the vector and print each element. */
//
//Using Arrays.toString:
//    Converts the vector to an array and uses Arrays.toString to print the elements.
//
//Using String.join:
//    Converts the vector elements to a string using String.join (for Vector<String>).

//What is Consumer<T>?
//✔Consumer<T> is a functional interface introduced in Java 8 under the java.util.function package.
//✔It represents an operation that accepts a single input argument and performs an action on it, 
//  but does not return any result.
//✔It is often used with lambda expressions and method references to perform actions like printing,
//  modifying, or storing data.
//✔ Consumer<T> takes one input but returns nothing.
//✔ forEach() uses Consumer<T> to iterate collections.
//✔ We can chain multiple Consumers using andThen().
//✔ It is useful for side effects like logging, modifying, or printing values.
