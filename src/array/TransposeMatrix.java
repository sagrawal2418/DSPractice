package array;

public class TransposeMatrix {

    public static void main(String[] args) {
        //Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
        //Output: [[1,4,7],[2,5,8],[3,6,9]]

        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int matrixLength = matrix.length;
        int subArrayLength = matrix[0].length;
        int[][] transposedMatrix = new int[subArrayLength][matrixLength];

        for (int i = 0; i < matrixLength; i++) {

            for (int j = 0; j < subArrayLength; j++) {

                System.out.println("i::=" + i);
                System.out.println("j::=" + j);
                System.out.println("matrix[i][j]" + matrix[i][j]);

                transposedMatrix[i][j] = matrix[j][i]; //i = 0; j = 1
            }
        }
    }
}
