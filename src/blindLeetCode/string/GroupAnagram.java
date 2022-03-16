package blindLeetCode.string;

import java.util.*;

public class GroupAnagram {

    public static void main(String[] args) {

        groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"});

    }

    public static List<List<String>> groupAnagrams(String[] strs) {

        Map<String, List<String>> map = new HashMap<>();

        for (String str : strs) {

            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String key = String.valueOf(chars);
            if (map.containsKey(key)) {
                List<String> values = map.get(key);
                values.add(str);
                map.put(key, values);
            } else {
                List<String> list = new ArrayList<>();
                list.add(str);
                map.put(key, list);
            }

        }

        return new ArrayList<>(map.values());
    }
}