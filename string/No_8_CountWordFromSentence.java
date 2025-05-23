package com.leetcode.string;

import java.util.Scanner;

public class No_8_CountWordFromSentence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String sentence = sc.nextLine();

        int wordCount = 0;

        // Trim leading/trailing spaces and check if string is empty
        sentence = sentence.trim();
        if (sentence.length() == 0) {
            wordCount = 0;
        } else {
            // Count spaces, words = spaces + 1
            for (int i = 0; i < sentence.length(); i++) {
                if (sentence.charAt(i) == ' ') {
                    wordCount++;
                }
            }
            wordCount += 1;
        }

        System.out.println("Total number of words: " + wordCount);
    }
}
