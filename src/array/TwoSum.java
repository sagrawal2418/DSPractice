package array;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {

    public static void main(String[] args) {

        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] indices = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }

        for (int j = 0; j < nums.length; j++) {

            if (map.containsKey(target - nums[j])) {
                System.out.println("j::" + j);
                indices[0] = j;
                indices[1] = map.get(target - nums[j]);
                break;
            }
        }

        System.out.println(Arrays.toString(indices));
    }
}
