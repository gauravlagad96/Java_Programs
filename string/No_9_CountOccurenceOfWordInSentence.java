package com.leetcode.string;

import java.util.Scanner;

public class No_9_CountOccurenceOfWordInSentence {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String sentence = sc.nextLine();

        sentence = sentence.toLowerCase(); // make it case-insensitive
        String[] words = sentence.split(" ");

        boolean[] visited = new boolean[words.length]; // to avoid counting duplicates

        System.out.println("Word frequencies:");

        for (int i = 0; i < words.length; i++) {
            if (visited[i] == true)
                continue;

            int count = 1;

            for (int j = i + 1; j < words.length; j++) {
                if (words[i].equals(words[j])) {
                    count++;
                    visited[j] = true; // mark duplicate
                }
            }

            System.out.println(words[i] + " → " + count);
        }
    }
}
