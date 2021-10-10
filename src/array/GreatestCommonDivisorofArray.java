package array;

import java.util.Arrays;

public class GreatestCommonDivisorofArray {

    public static void main(String[] args) {

        int[] nums = {7, 5, 6, 8, 3};

        Arrays.sort(nums);

        int a = nums[nums.length - 1]; //8
        int b = nums[0]; //3

        System.out.println(findGCD(a, b));
    }

    private static int findGCD(int a, int b) {
        if (b == 0) {
            return a; //
        }
        return findGCD(b, a % b);
    }
}
