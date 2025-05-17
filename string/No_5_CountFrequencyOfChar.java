package com.leetcode.string;

public class No_5_CountFrequencyOfChar {
    public static void main(String[] args) {
        String str = "H@llo123! World#   2025";

        // Create an array of size 128 to cover all ASCII characters
        int[] count = new int[128];

        // Count each character's occurrence
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            count[c]++;  // Use ASCII value of character as index
        }

        // Print only characters that are present in the string
        for (int i = 0; i < 128; i++) {
            if (count[i] > 0) {
                System.out.println("'" + (char)i + "' => " + count[i]);
            }
        }
    }
}
