package array;

public class FindRowWithMaxOne {

    /*
    Input matrix
0 1 1 1
0 0 1 1
1 1 1 1  // this row has maximum 1s
0 0 0 0

Output: 2
     */
    public static void main(String[] args) {


        int[][] matrix = {{0, 1, 1, 1}, {0, 0, 1, 1}, {1, 1, 1, 1}, {0, 0, 0, 0}};

        int currentMax = 0, max = 0;
        int maxIndex = -1;

        for (int i = 0; i < matrix.length; i++) {

            currentMax = 0;
            for (int j = 0; j < matrix[0].length; j++) {

                if (matrix[i][j] == 1) {
                    currentMax++;
                }
            }
            if (currentMax > max) {
                max = currentMax;
                maxIndex = i;
            }
        }

        System.out.println(maxIndex);
    }
}
