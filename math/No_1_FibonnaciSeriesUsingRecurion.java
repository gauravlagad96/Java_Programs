package com.leetcode.math;


public class No_1_FibonnaciSeriesUsingRecurion {

    // Recursive method to get the nth Fibonacci number
    public static int fibonacci(int n) { //3
        if (n <= 1)
            return n;
        return fibonacci(n - 1) + fibonacci(n - 2);  //
    }

    public static void main(String[] args) {
        int n = 10; // Number of Fibonacci terms to print

        System.out.print("Fibonacci Series: ");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " "); //0 1 1  
        }
    }
}
