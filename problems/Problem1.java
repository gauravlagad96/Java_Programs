package com.problems;

// print m1 method variable in m2
public class Problem1 {

	// Method m1 returns an int value (age)
	public int m1() {
		int age = 28;
		return age;
	}

	// Method m2 calls m1 and prints the returned value
	public void m2() {
		int ageFromM1 = m1(); // Call m1 and store its returned value
		System.out.println("Age from m1: " + ageFromM1); // Print the value
	}

	public static void main(String[] args) {
		Problem1 obj = new Problem1();
		obj.m2();
		
	}
}
