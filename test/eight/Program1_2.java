package com.test.eight;

public class Program1_2 {

    public static void main(String[] args) {
        
        int arr[] = {5, 2, 9, 1, 5, 6, 3, 8, 7, 4};
        
       
        if (arr.length < 2) {
            System.out.println("Array must have at least two elements.");
            return;
        }

        int highest = 0;
        int secondHighest = 0;
        
        // logic of find highest and second highest
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > highest) {
                secondHighest = highest;
                highest = arr[i];
                System.out.println(arr[i]);
            } else if (arr[i] > secondHighest && arr[i] != highest) {
                secondHighest = arr[i];
                System.out.println(arr[i] + " print in else if");
            }
        }
        
     
        if (secondHighest == Integer.MIN_VALUE) {
            System.out.println("No second highest element found.");
        } else {
            System.out.println("Second highest element is: " + secondHighest);
        }
    }
}
