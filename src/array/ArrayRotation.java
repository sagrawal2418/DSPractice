package array;

import java.util.Arrays;

public class ArrayRotation {

/*    Approach:
            1) Divide the array with d elements and move it to temp array
2) Move the remaining array from the index 0
            3) append the temp array at the end.*/

    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5};
        int rotationSize = 2;
        int[] temp = new int[rotationSize];

        for (int i = 0; i < rotationSize; i++) {
            temp[i] = numbers[i];
        }

        //3,4,5,4,5
        int iterator = 0;
        for (int j = rotationSize; j < numbers.length; j++) {
            numbers[iterator] = numbers[j];
            System.out.println(Arrays.toString(numbers));
            iterator++;
        }

        System.out.println(iterator);
        System.out.println(numbers);
        for (int k = 0; k < temp.length; k++) {
            numbers[iterator] = temp[k];
            iterator++;
        }

        System.out.println(Arrays.toString(numbers));



    }
}
