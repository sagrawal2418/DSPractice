package string;

import java.util.ArrayList;
import java.util.List;

public class LengthOfLastWord {

    public static void main(String[] args) {

        lengthOfLastWord("Hello World");
    }

    public static int lengthOfLastWord(String s) {

        s = s.trim();

        String[] parts = s.split(" ");

        return parts[parts.length - 1].length();
    }
}
