package string;

public class AddBinary {

    public static void main(String[] args) {

        addBinary("1010", "1011");

    }

    public static String addBinary(String a, String b) {

        StringBuilder stringBuilder = new StringBuilder();
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carryOver = 0;

        while (i >= 0 || j >= 0) {
            int sum = carryOver;
            if (i >= 0) sum += a.charAt(i) - '0';
            if (j >= 0) sum += b.charAt(j) - '0';
            stringBuilder.append(sum % 2);
            carryOver = sum / 2;
            i--;
            j--;
        }

        if (carryOver != 0) stringBuilder.append(carryOver);
        return stringBuilder.reverse().toString();
    }
}
