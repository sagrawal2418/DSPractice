package string;


import static string.Roman.*;

enum Roman {
    ONE('I'),
    FIVE('V'),
    TEN('X'),
    FIFTY('L'),
    HUNDRED('C'),
    FIVE_HUNDRED('D'),
    THOUSAND('M');

    private char value;

    Roman(char value) {
        this.value = value;
    }

    public char getValue() {
        return value;
    }
}

public class intToRoman {

    static int num = 3800;

    static String value = "";


    public static void main(String[] args) {

  /*      // III, IV = 4, VIII = 6, V = 5, IX = 9 , XIII, XIV

        //3999 => MMMCMXCIX

        900 => CM, D => 500
        800  => DCCC, 400 => CD
        989/1000 = 0 => 789/100 = 700

        789/100 = 7 , 789%100 = 89; res = ""
        789/10

        var = 1000, 100, 10

        for(int i = 1000, i > 0; i/10;)
Symbol       Value
I             1
V             5
X             10
L             50
C             100
D             500
M             1000


        8
        27
        645
        3915*/


        handleCode();

        String[] thousand = {"", "M", "MM", "MMM"};
        String[] hundred = {"C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
        String[] tens = {"X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String[] ones = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};

        String temp = thousand[num / 1000];
        System.out.println(value);
    }

    private static void handleCode() {

        if (num / 1000 > 0) {
            int divisor = num / 1000;
            for (int i = 0; i < divisor; i++) {
                value = value + THOUSAND.getValue();
            }
            num = num % 1000;
            handleCode();
        } else {
            if (num / 100 > 0) {
                if (num / 100 == 9) {
                    value = value + HUNDRED.getValue() + THOUSAND.getValue();
                } else {
                    int divisor = num / 100;
                    if (divisor >= 5) {
                        value = value + Roman.FIVE_HUNDRED.getValue();
                        divisor = divisor - 5;
                    }
                    if (divisor == 4) {
                        value = value + HUNDRED.getValue() + FIVE_HUNDRED.getValue();
                    } else {
                        for (int i = 0; i < divisor; i++) {
                            value = value + HUNDRED.getValue();
                        }
                    }

                    num = num % 100;
                    handleCode();
                }
                if (num / 10 > 0) {
                    if (num / 10 == 9) {
                        value = value + Roman.TEN.getValue() + HUNDRED.getValue();
                    } else {
                        int divisor = num / 10;
                        for (int i = 0; i < divisor; i++) {
                            if (divisor >= 5 && i == 0) {
                                value = value + FIFTY.getValue();
                            } else {
                                value = value + TEN.getValue();
                            }
                        }
                    }
                    num = num % 10;
                    handleCode();
                }
                if (num > 0 && num < 10) {
                    if (num == 9) {
                        value = value + ONE.getValue() + TEN.getValue();
                    } else {
                        if (num >= 5) {
                            value = value + FIVE.getValue();
                            num = num - 5;
                        } else {
                            for (int i = 0; i < num; i++) {
                                value = value + ONE.getValue();
                            }
                            num = 0;
                        }
                        handleCode();
                    }
                }
            }
        }
    }

}
