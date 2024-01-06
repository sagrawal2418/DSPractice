package string;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindAndReplacePattern {

    public static void main(String[] args) {

        String[] words = {"abc", "deq", "mee", "aqq", "dkd", "ccc"};
        findAndReplacePattern(words, "abb");

    }

    public static List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> strings = new ArrayList<>();
        for (String word : words) {
            if (get(word).equals(get(pattern))) {
                strings.add(word);
            }
        }
        return strings;
    }

    public static String get(String word) {
        int i = 0;
        StringBuilder builder = new StringBuilder();
        Map<Character, Integer> map = new HashMap<>();
        for (char c : word.toCharArray()) {
            if (!map.containsKey(c)) {
                map.put(c, i++);
                builder.append(i);
            } else {
                builder.append(map.get(c));
            }
        }

        return builder.toString();
    }


}
