package com.classes;

//Singletone class:=> create only one instance of class

class A {
	// 1.
	static A obj = new A();

	// 2.
	private A() {

	}

	// 3.
	public static A getInstance() {
		return obj;
	}

}

public class SingletonEx {

	public static void main(String[] args) {

		A obj1 = A.getInstance();
		A obj2 = A.getInstance();
		System.out.println(obj1.hashCode());
		System.out.println(obj2.hashCode());
	}

}
