package com.hackerrank;

import java.util.*;
import java.io.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter NO of queries :");
        int q = sc.nextInt(); //Number of queries

        //Loop through each query
        for (int i = 0; i < q; i++) {
        	System.out.println("Enter 3 numbers : ");
            int a = sc.nextInt();
            int b = sc.nextInt();
            int n = sc.nextInt();

            //Start constructing the series for each query
            int sum = a;
            for (int j = 0; j < n; j++) {
                sum += (Math.pow(2, j) * b);
                System.out.print(sum + " ");
            }
            System.out.println(); //New line after each series
        }
        sc.close();
    }
}
