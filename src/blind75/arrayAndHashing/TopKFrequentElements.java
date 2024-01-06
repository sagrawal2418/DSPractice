package blind75.arrayAndHashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
Given an integer array nums and an integer k, return the k most
frequent elements. You may return the answer in any order.

Example 1:

Input: nums = [1,1,1,2,2,3], k = 2
Output: [1,2]
Example 2:

Input: nums = [1], k = 1
Output: [1]

Solution Description:
Here we first need to loop through the array and add the key which is the num and the frequency of each num
inside the hashmap of Integer, Integer.

Once we are done adding the key value

We need to store the numbers in the list of arrays where the size of the array would be the length
of num + 1

We then iterate through all the hashmap keys and get value for each key which is the frequency of num
we then check to see if bucket has any value in the frequency index. If not we create object of list and add
the key into the particular index.


Once have the list of integer array, now we need to iterate the array in reverse order as the highest
frequency will be at the end. During iteration we only want to iterate as long as we get the top k frequency.

 */

public class TopKFrequentElements {

    public static int[] topKFrequent(int[] nums, int k) {

        // iterate through the loop
        // add key and number as values in hashmap
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer>[] bucket = new List[nums.length + 1];

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        /*
        result of map
        {1, 3}
        {2, 2}
        {3, 1}
         */

        for (int key : map.keySet()) {
            int frequency = map.get(key);
            if (bucket[frequency] == null) {
                bucket[frequency] = new ArrayList<>();
            }
            bucket[frequency].add(key);

        }
        /*
        {
        [],
        [3],
        [2],
        [1]
        }
         */

        int[] res = new int[k];
        int counter = 0;

        for (int pos = bucket.length - 1; pos >= 0 && counter < k; pos--) {
            if (bucket[pos] != null) {
                for (Integer integer : bucket[pos]) {
                    res[counter++] = integer;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {

        System.out.println(topKFrequent(new int[]{1, 1, 1, 2, 2, 3}, 2));
    }
}
