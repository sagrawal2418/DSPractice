package blindLeetCode.array;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {

    public static void main(String[] args) {
        twoSum(new int[]{3, 2, 4}, 6);
    }

    public static int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> map = new HashMap<>();
        int[] result = new int[2];

        //[3,3]

        for (int j = 0; j < nums.length; j++) {

            if (map.containsKey(target - nums[j])) {
                result[0] = j;
                result[1] = map.get(target - nums[j]);
                return result;
            }
            map.put(nums[j], 0);
        }

        System.out.println(Arrays.toString(result));
        return result;
    }
}
