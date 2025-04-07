package com.string;

// WAP to calculate the occurrence of each character in a string without using inbuilt functions
public class CountOccurrenceOfChar {
    public static void main(String[] args) {
       
    	String str = "hello world"; // Example string
        int[] freq = new int[256]; // Array to store character frequencies (supports ASCII characters)
        
        // Loop through each character in the string
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch != ' ') { // Ignore spaces
                freq[ch]++;
            }
        }
        
        // Display character occurrences
        System.out.println("Character occurrences:");
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > 0) {
                System.out.println((char) i + ": " + freq[i]);
            }
        }
        
           
    }
}
