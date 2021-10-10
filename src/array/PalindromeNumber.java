package array;

public class PalindromeNumber {

    public static void main(String[] args) {

        /*
        int x = 12%10 = 2;
        int y = 12/10 = 1;
        int value = x*10 + y;
        int c = c*10 + x;

        //  y = 123
        x = y%10;//3 //2 //1
        y = y/10; 12 //1 //0
        c = c *10 + x; //3 //32 //321
         */
        int n = 12321;


        String value;
        //int n =12321

        value = Integer.toString(n);
        int range = value.length() / 2;
        for (int i = 0; i < range; i++) {

            if (value.charAt(i) != value.charAt(value.length() - 1 - i)) {
                System.out.println("Not a palindrome");
                return;
            }
        }
    }
}
