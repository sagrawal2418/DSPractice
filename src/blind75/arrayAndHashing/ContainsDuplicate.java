package blind75.arrayAndHashing;

import java.util.HashMap;

/*
Given an integer array nums, return true if any value appears at least twice in the array,
and return false if every element is distinct.

Example 1:

Input: nums = [1,2,3,1]
Output: true
Example 2:

Input: nums = [1,2,3,4]
Output: false
Example 3:

Input: nums = [1,1,1,3,3,4,3,2,4,2]
Output: true
 */
public class ContainsDuplicate {


    public static boolean containsDuplicate(int[] nums) {
        if (nums.length < 2) return false;

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            if (map.containsKey(num)) {
                return true;
            } else {
                map.put(num, num);
            }

        }
        return false;
    }

    public static void main(String[] args) {

        System.out.println(containsDuplicate(new int[]{1,1,1,3,3,4,3,2,4,2}));
    }

}


