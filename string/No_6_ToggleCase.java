package com.leetcode.string;

public class No_6_ToggleCase {
    public static void main(String[] args) {
        String input = "GuRu99";
        StringBuilder toggled = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            // Check if the character is uppercase
            if (ch >= 'A' && ch <= 'Z') {
                ch = (char) (ch + 32); // Convert to lowercase
            } 
            // Check if the character is lowercase
            else if (ch >= 'a' && ch <= 'z') {
                ch = (char) (ch - 32); // Convert to uppercase
            }

            // Append the toggled character
            toggled.append(ch);
        }
        System.out.println("Original String: " + input);
        System.out.println("Toggled String: " + toggled.toString());
    }
}
