package com.collection.list.vector;

import java.util.Vector;

public class N_1_CheackVectorCapacity {

	public static void main(String[] args) {

		Vector v = new Vector();
		int defCapacity = v.capacity();

		System.out.println("Default capacity: " + defCapacity);
		v.add(38);
		v.add(38);
		v.add(38);
		v.add(38);
		v.add(38);
		v.add(38);
		v.add(38);
		v.add(38);
		v.add(38);
		v.add(38);
		v.add(38);
		System.out.println("current capacity " + v.capacity());
	}
}
