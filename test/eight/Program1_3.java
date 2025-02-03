package com.test.eight;

import java.util.HashMap;
import java.util.Map;

public class Program1_3 {
    public static void main(String[] args) {

        String inputString = "giritechHubb";

        Map<Character, Integer> charCountMap = new HashMap<>();


        for (int i = 0; i < inputString.length(); i++) {
            char currentChar = inputString.charAt(i);

            if (charCountMap.containsKey(currentChar)) {
                charCountMap.put(currentChar, charCountMap.get(currentChar) + 1);
            } else {
                charCountMap.put(currentChar, 1);
            }
        }
        
        System.out.println("Duplicate characters in the string:");
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " occurs " + entry.getValue() + " times.");
            }
        }
    }
}
