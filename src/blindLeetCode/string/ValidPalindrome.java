package blindLeetCode.string;

public class ValidPalindrome {

    public static void main(String[] args) {

        System.out.println(isPalindrome(""));

    }

    public static boolean isPalindrome(String s) {

        String updated = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();

        if (updated.trim().isEmpty()) {
            return true;
        }

        for (int i = 0; i < updated.length(); i++) {

            if (updated.charAt(i) != updated.charAt(updated.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }

}
