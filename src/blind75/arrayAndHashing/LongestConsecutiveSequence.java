package blind75.arrayAndHashing;

import java.util.HashMap;
import java.util.List;

/*
Given an unsorted array of integers nums, return the length of the longest
consecutive elements sequence.

You must write an algorithm that runs in O(n) time.

Example 1:

Input: nums = [100,4,200,1,3,2]
Output: 4
Explanation: The longest consecutive elements sequence is [1, 2, 3, 4]. Therefore its length is 4.
Example 2:

Input: nums = [0,3,7,2,5,8,4,6,0,1]
Output: 9
 */
public class LongestConsecutiveSequence {

    public static int longestConsecutiveSequence(int[] arr) {
        HashMap<Integer, Boolean> map = new HashMap<>();
        int longestLength = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            map.put(arr[i], false);
        }

        for (int num : arr) {
            int currentLength = 1;

            //check in forward direction
            int nextNum = num + 1;
            while (map.containsKey(nextNum) && !map.get(nextNum)) {
                currentLength++;
                map.put(nextNum, false);

                //Move to next number
                nextNum++;
            }

            //check in reverse direction
            int prevNum = num - 1;
            while (map.containsKey(prevNum) && !map.get(prevNum)) {
                currentLength++;
                map.put(prevNum, false);

                //Move to next number
                prevNum--;
            }
            longestLength = Math.max(longestLength, currentLength);
        }
        return longestLength;

    }


    public static void main(String[] args) {

        System.out.println(longestConsecutiveSequence(new int[]{0, 3, 7, 2, 5, 8, 4, 6, 0, 1}));
    }
}
