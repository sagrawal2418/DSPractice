package string;

import java.util.HashMap;

public class IsomorphicStrings {

    public static void main(String[] args) {

        isIsomorphic("egg", "add");

    }

    public static boolean isIsomorphic(String s, String t) {


        int[] m1 = new int[256];
        int[] m2 = new int[256];


        for (int i = 0; i < s.length(); i++) {

            char s1 = s.charAt(i);
            char t1 = t.charAt(i);

            if (m1[s1] != m2[t1]) return false;
            m1[s1] = i + 1;
            m2[t1] = i + 1;
        }

        return true;

    }

}
