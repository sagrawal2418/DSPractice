package array;

import java.util.Arrays;

public class RunningSum {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        int[] value = new int[4];
        value[0] = nums[0];

        for (int i = 1; i < nums.length; i++) {
            value[i] = value[i - 1] + nums[i];
        }
        System.out.println(Arrays.toString(value));
    }
}
