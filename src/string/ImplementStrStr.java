package string;

public class ImplementStrStr {

    public static void main(String[] args) {

        //Input: haystack = "hello", needle = "ll"

        strStr("hello", "ll");

    }

    public static int strStr(String haystack, String needle) {

        if (haystack.contains(needle)) {
            return haystack.indexOf(needle);
        }
        return -1;

    }
}
