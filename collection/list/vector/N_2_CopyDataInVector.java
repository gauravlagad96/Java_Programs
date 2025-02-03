package com.collection.list.vector;

import java.util.*;

public class N_2_CopyDataInVector {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(23);
		al.add(233);
		al.add(3432);

		// this constructor is able copy the data from another collection and store in
		// vector.

		Vector v = new Vector(al);
		System.out.println(v);
	}
}
