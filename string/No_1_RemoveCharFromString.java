package com.string;

public class No_1_RemoveCharFromString {

    public static void main(String[] args) {
        String name = "gauravjkkkkkkkuuuuuuuu";
        char removeChar = 'u';
        
        // Step 1: Create an empty string to store the new result
        String newName = "";

        // Step 2: Iterate through the string and build a new string without 'u'
        for (int i = 0; i < name.length(); i++) {
            char c = name.charAt(i);
            if (c != removeChar) {
                newName += c;  // Append only if it's not 'u'
            }
        }

        // Step 3: Print the modified string
        System.out.println("Modified String: " + newName);
    }
}
