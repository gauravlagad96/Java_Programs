package com.problems;

public class Problem2 {
    
    // Declare age as an instance variable
    private int age;
    
    // Method m1 assigns a value to age
    public void m1() {
        age = 23;  // Assign age
    }

    // Method m2 prints the value of age
    public void m2() {
        System.out.println("Age from m1: " + age);  // Print age
    }
    
    public static void main(String[] args) {
        Problem2 obj = new Problem2();
        obj.m1();
        obj.m2();
    }

    
}
