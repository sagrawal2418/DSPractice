package blind75.arrayAndHashing;

import java.util.Arrays;
import java.util.HashMap;

/*
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.

Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
Example 2:

Input: nums = [3,2,4], target = 6
Output: [1,2]
Example 3:

Input: nums = [3,3], target = 6
Output: [0,1]

 */
public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> map = new HashMap<>();
        int[] indices = new int[2];

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }

        for (int j = 0; j < nums.length; j++) {
            int complement = target - nums[j];

            if (map.containsKey(complement) && map.get(complement) != j) {
                indices[0] = j;
                indices[1] = map.get(target - nums[j]);
                break;
            }
        }
        return indices;
    }

    public static void main(String[] args) {

        int[] result = twoSum(new int[]{3, 2, 4}, 6);
        System.out.println(Arrays.toString(result));

    }
}
