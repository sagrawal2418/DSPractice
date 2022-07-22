package string;

import java.util.HashMap;

public class RomanToInteger {

    public static void main(String[] args) {

        System.out.println(romanToInt("MCMXCIV"));

    }

    public static int romanToInt(String s) {

        //MCMXCIV

        HashMap<Character, Integer> values = new HashMap<>();

        values.put('I', 1);
        values.put('V', 5);
        values.put('X', 10);
        values.put('L', 50);
        values.put('C', 100);
        values.put('D', 500);
        values.put('M', 1000);

        int currentValue = values.get(s.charAt(s.length() - 1));

        for (int i = s.length() - 2; i >= 0; i--) {

            if (values.get(s.charAt(i)) < values.get(s.charAt(i + 1))) {
                currentValue = currentValue - values.get(s.charAt(i));
            } else {
                currentValue = currentValue + values.get(s.charAt(i));
            }
        }

        return currentValue;
    }
}
