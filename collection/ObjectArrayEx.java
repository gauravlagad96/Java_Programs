package com.collection;

import java.util.Date;

public class ObjectArrayEx {
	public static void main(String[] args) {
		Object obj[] = new Object[5];
		obj[0] = "gaurav";
		obj[1] = 96;
		obj[2] = 19.90d;
		obj[3] = new Date();
		System.out.println(obj[3]);

		for (int i = 0; i < obj.length; i++) {
			System.out.println(obj[i]);
		}
	}
}
