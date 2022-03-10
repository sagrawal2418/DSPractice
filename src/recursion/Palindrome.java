package recursion;

public class Palindrome {

    public static void main(String[] args) {

        int num = 2002;


        System.out.println(isPalindrome("aab"));
    }

    public static boolean isPalindrome(String str) {

        //22
        if (str.length() <= 1) {
            return true;
        }

        if (str.charAt(0) == str.charAt(str.length() - 1)) {
            return isPalindrome(str.substring(1, str.length() - 1));
        }

        //0 0
        if (str.charAt(0) != str.charAt(str.length() - 1)) {
            return false;
        }

        return true;
    }
}
