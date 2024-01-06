package string;

public class ExcelSheetColumnNumber {

    public static void main(String[] args) {

        convertToTitle(701);
        convertNumberToTitle("AAA");

    }

    public static String convertToTitle(int columnNumber) {

        StringBuilder str = new StringBuilder();

        while (columnNumber > 0) {
            columnNumber--;
            char rightMostLater = (char) (columnNumber % 26 + 'A');
            str.append(rightMostLater);
            columnNumber /= 26;
        }

        return str.reverse().toString();
    }

    public static int convertNumberToTitle(String columnTitle) {
        int result = 0;
        for (int i = 0; i < columnTitle.length(); i++) {
            result = result * 26;
            result += (columnTitle.charAt(i) - 'A' + 1);
        }
        return result;
    }
}
