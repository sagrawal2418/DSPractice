package blind75.arrayAndHashing;

import java.util.*;

/*
Given an array of strings strs, group the anagrams together. You can return the answer in any order.

An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase,
typically using all the original letters exactly once.

Example 1:

Input: strs = ["eat","tea","tan","ate","nat","bat"]
Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
Example 2:

Input: strs = [""]
Output: [[""]]
Example 3:

Input: strs = ["a"]
Output: [["a"]]

 */

public class GroupAnagram {

    public static List<List<String>> groupAnagrams(String[] strs) {

        Map<String, List<String>> map = new HashMap<>();

        for (String str : strs) {

            char[] arr = str.toCharArray();
            Arrays.sort(arr);
            String key = new String(arr);

            if (map.containsKey(key)) {
                map.get(key).add(str);
            } else {
                List<String> strList = new ArrayList<>();
                strList.add(str);
                map.put(key, strList);
            }
        }

        List<List<String>> list = new ArrayList<>();
        list.addAll(map.values());
        return list;
    }

    public static void main(String[] args) {

        System.out.println(groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"}));

    }
}
