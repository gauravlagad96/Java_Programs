package com.collection.list.vector;

import java.util.Vector;
import java.util.ArrayList;
import java.util.List;

public class N_4_VectorAllConstructor {
	public static void main(String[] args) {
		// 1. Default Constructor
		Vector<Integer> vector1 = new Vector<>();
		vector1.add(10);
		vector1.add(20);
		vector1.add(30);
		System.out.println("Vector 1 (Default Constructor): " + vector1);

		// 2. Constructor with Initial Capacity
		Vector<Integer> vector2 = new Vector<>(5); // Initial capacity of 5
		vector2.add(40);
		vector2.add(50);
		vector2.add(60);
		System.out.println("Vector 2 (Initial Capacity Constructor): " + vector2);

		// 3. Constructor with Initial Capacity and Capacity Increment
		Vector<Integer> vector3 = new Vector<>(3, 2); // Initial capacity of 3, increment by 2
		vector3.add(70);
		vector3.add(80);
		vector3.add(90);
		vector3.add(100); // Capacity increases by 2 when exceeded
		System.out.println("Vector 3 (Capacity Increment Constructor): " + vector3);

		// 4. Constructor with a Collection
		List<Integer> list = new ArrayList<>();
		list.add(110);
		list.add(120);
		list.add(130);
		Vector<Integer> vector4 = new Vector<>(list); // Vector from a collection
		System.out.println("Vector 4 (Collection Constructor): " + vector4);
	}
}
//There are 4 constructors in the Vector class.