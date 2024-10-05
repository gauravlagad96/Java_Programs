package com.collection.framework;

import java.util.Vector;

public class VectorApp {
	public static void main(String x[])
	   {
	      Vector<Integer> v = new Vector<Integer>();
		  int defaultCapacity=v.capacity();
		  System.out.println("Default capacity of Vector is "+defaultCapacity);
		  v.add(10);
		  v.add(20);
		  v.add(30);
		  v.add(40);
		  v.add(50);
		  v.add(60);
		  v.add(70);
		  v.add(80);
		  v.add(90);
		  v.add(100);
		  v.add(100);
		  int currentCapacity=v.capacity();
		  System.out.println("current capacity of Vector is "+currentCapacity);

	   }


}
