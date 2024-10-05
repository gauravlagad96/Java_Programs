package com.collection.framework;
//import java.util.*;
public class ObjectArrayApp {
	public static void main(String x[]) {
		Object obj[] = new Object[5];
		obj[0] = "good";
		obj[1] = 100;
		obj[2] = 100.5f;
		obj[3] = false;
//		obj[4] = new Date();
		obj[4]= new java.util.Date();
		System.out.println("Display array values");
		for (int i = 0; i < obj.length; i++) {
			System.out.println(obj[i] + "\t");
		}
	}

}
