package blindLeetCode.string;

import java.util.ArrayList;
import java.util.List;

public class EncodeDecodeStrings {

    private static int[] characterCount;

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("lint");
        list.add("code");
        list.add("love");
        list.add("you");

        characterCount = new int[list.size()];
        System.out.println(decode(encode(list)));
    }

    /*
     * @param strs: a list of strings
     * @return: encodes a list of strings to a single string.
     */
    public static String encode(List<String> strs) {

        StringBuilder encoded = new StringBuilder();
        for (int i = 0; i < strs.size(); i++) {
            characterCount[i] = strs.get(i).length();
            encoded.append(strs.get(i));
            encoded.append("#");
        }

        return encoded.toString();
        // write your code here
    }

    /*
     * @param str: A string
     * @return: dcodes a single string to a list of strings
     */
    public static List<String> decode(String str) {

        List<String> list = new ArrayList<>();
        int startIndex = 0;
        int endIndex = characterCount[0]; //4, 4, 4, 3
        //lint#code#love#you#
        for (int j : characterCount) {
            list.add(str.substring(startIndex, endIndex));
            startIndex = startIndex + j + 1;
            endIndex = j + startIndex;
        }

        return new ArrayList<>();
        // write your code here
    }


}
