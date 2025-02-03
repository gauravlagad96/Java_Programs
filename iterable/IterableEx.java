package com.iterable;

import java.util.Iterator;
import java.util.Vector;

public class IterableEx {
	public static void main(String[] args) {
		
	
	Vector<Integer> v= new Vector<Integer>();
	v.add(19);
	v.add(34);
	v.add(3);
	
	Iterator li= v.iterator();
	
	while(li.hasNext()) {
		Object o=li.next();
		System.out.print(o + " ");
	}

	
}
}