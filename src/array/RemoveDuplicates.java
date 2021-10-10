package array;

import java.util.Arrays;

public class RemoveDuplicates {

    public static void main(String[] args) {

        //  [0,1,0,0,1,1,1,2,2,3,3,4] => int a = 4, int b = 2;

        int[] nums = {0, 0, 0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int a = 0;
        int b = 0;

        for (int i = 1; i < nums.length; i++) {
            a++;
            if (nums[a] != nums[a-1]) {
                nums[++b] = nums[i];
            }
        }

        System.out.println(Arrays.toString(nums));
    }
}
