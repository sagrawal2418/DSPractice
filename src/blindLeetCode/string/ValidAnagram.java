package blindLeetCode.string;

import java.util.*;

public class ValidAnagram {

    public static void main(String[] args) {
        System.out.println(isAnagram("rac", "car"));
    }

    public static boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        List<Integer> list = new ArrayList<>();

        for (char c : s.toCharArray()) {
            list.add((int) c);
        }

        System.out.println(list);

        for (char b : t.toCharArray()) {
            int data = list.lastIndexOf((int) b);
            if (data == -1) return false;
            list.remove(data);
        }

        return list.isEmpty();

    }

}


/*
1) convert to charArray //O(n)
2) store one of the charArrays in list //O(n)
3) iterate the other one, keep removing when match is found //O(n)
4) list is empty, return true else false

O(4n), O(n)
int[] arr = new int[256]; //[0,0,0,...]
O(3n)


*/