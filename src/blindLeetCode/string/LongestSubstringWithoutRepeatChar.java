package blindLeetCode.string;

import java.util.ArrayList;
import java.util.List;

public class LongestSubstringWithoutRepeatChar {

    public static void main(String[] args) {

        System.out.println(lengthOfLongestSubstring("dvdf"));

    }

    public static int lengthOfLongestSubstring(String s) {

        if (s.equals("")) return 0;
        char prevChar = s.charAt(0);
        StringBuilder stringBuilder = new StringBuilder();
        String data = String.valueOf(s.charAt(0));
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) != prevChar && (stringBuilder.indexOf(String.valueOf(s.charAt(i)))) == -1) {
                prevChar = s.charAt(i);
                stringBuilder.append(s.charAt(i));
                if (s.length() - 1 == i) {
                    if (!data.equals(stringBuilder.toString())) {
                        data = data + stringBuilder.toString();
                    } else {
                        data = stringBuilder.toString();
                        stringBuilder.setLength(0);
                    }
                }
            } else {
                if (stringBuilder.toString().length() > data.length()) {
                    data = stringBuilder.toString();
                    stringBuilder.setLength(0);
                    stringBuilder.append(s.charAt(i));
                    prevChar = s.charAt(i);
                }
            }
        }

        return stringBuilder.toString().length() + data.length();

    }


}
