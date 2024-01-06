package blind75.arrayAndHashing;

import java.util.Arrays;

/*
Given an integer array nums, return an array answer such that answer[i] is equal
to the product of all the elements of nums except nums[i].

The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
You must write an algorithm that runs in O(n) time and without using the division operation.

Example 1:
Input: nums = [1,2,3,4]
Output: [24,12,8,6]
Example 2:
Input: nums = [-1,1,0,-3,3]
Output: [0,0,9,0,0]
 */
public class ProductOfArrayExceptSelf {

    public static int[] productExceptSelf(int[] nums) {


//        for (int i = 0; i < nums.length; i++) {
//
//            int sum = 1;
//
//            for (int j = 0; j < nums.length; j++) {
//
//                if (j != i) {
//                    sum = sum * nums[j];
//                }
//            }
//            res[i] = sum;
//        }

        int[] leftArray = new int[nums.length];
        int[] rightArray = new int[nums.length];
        int[] ans = new int[nums.length];


        leftArray[0] = 1;
        for (int i = 1; i < nums.length; i++) {
            leftArray[i] = leftArray[i - 1] * nums[i - 1];
        }

        rightArray[nums.length - 1] = 1;
        ans[0] = rightArray[0] * leftArray[0];
        ans[nums.length - 1] = rightArray[nums.length - 1] * leftArray[nums.length - 1];
        for (int i = nums.length - 2; i > -1; i--) {
            rightArray[i] = rightArray[i + 1] * nums[i + 1];
            ans[i] = leftArray[i] * rightArray[i];
        }
        return ans;
    }


    public static void main(String[] args) {

        System.out.println(Arrays.toString(productExceptSelf(new int[]{1, 2, 3, 4})));
    }
}
