package blind75.arrayAndHashing;

import java.util.ArrayList;
import java.util.List;

public class EncodeAndDecodeStrings {

    static String DELIMETER = "#";

    public static String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();

        for (String s : strs) {
            sb.append(s.length()).append(DELIMETER).append(s);
        }

        return sb.toString();


    }

    public static List<String> decode(String str) {

        // 5#Hello5#World
        List<String> res = new ArrayList<>();
        int i = 0;

        while (i < str.length()) {
            int start = str.indexOf(DELIMETER, i);
            int size = Integer.valueOf(str.substring(i, start));
            i = start + size + 1;
            res.add(str.substring(start + 1, i));

        }
        return res;
    }

    public static void main(String[] args) {

        List<String> str = new ArrayList<>();
        str.add("Hello");
        str.add("World");
        System.out.println(decode(encode(str)));
    }
}
