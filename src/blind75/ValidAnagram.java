package blind75;

/*
Given two strings s and t, return true if t is an anagram of s, and false otherwise.

An Anagram is a word or phrase formed by rearranging the letters of a different word or
phrase, typically using all the original letters exactly once.


Example 1:

Input: s = "anagram", t = "nagaram"
Output: true
Example 2:

Input: s = "rat", t = "car"
Output: false
 */


import java.util.*;

public class ValidAnagram {

    public static boolean isAnagram(String s, String t) {
        if (s == null || t == null || s.length() != t.length()) {
            return false;
        }

        int[] charCount = new int[26]; // Assuming only lowercase alphabetical characters

        for (char c : s.toCharArray()) {
            charCount[c - 'a']++;
        }

        for (char c : t.toCharArray()) {
            charCount[c - 'a']--;
        }

        for (int count : charCount) {
            if (count != 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        System.out.println(isAnagram("anagram", "nagaram"));
    }
}
