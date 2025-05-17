package com.leetcode.string;

public class No_4_FirstOccurrenceFinder {

    public int findFirstIndex(String haystack, String needle) {
        int hLen = haystack.length();
        int nLen = needle.length();

        for (int i = 0; i <= hLen - nLen; i++) {
            int j;
            for (j = 0; j < nLen; j++) {
                if (haystack.charAt(i + j) != needle.charAt(j)) {
                    break;
                }
            }
            if (j == nLen) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        No_4_FirstOccurrenceFinder finder = new No_4_FirstOccurrenceFinder();
        System.out.println(finder.findFirstIndex("sadbutsad", "sad"));     // Output: 0
        System.out.println(finder.findFirstIndex("leetcode", "leeto"));    // Output: -1
    }
}
