package blindLeetCode.array;

import java.util.*;

public class ThreeSum {

    List<List<Integer>> result = new ArrayList<>();
    public List<List<Integer>> threeSum(int[] nums) {
        // Sort
        //{-1,0,1,2,-1,-4} ==> {-4,-1,-1,0,1,2}
        Arrays.sort(nums);

        Set<List<Integer>> set = new HashSet<>();
        for(int i=0;i<nums.length-1;i++){
            int target = -nums[i];
            twoSum(target,i+1,nums.length-1,nums, set);
        }
        return result;
    }
    //SOLID
    public void twoSum(int target,int start,int end,int[] nums, Set<List<Integer>> set){
        List<Integer> inner = new ArrayList<>();
        //loop ==> 0,0,0,0
        // -1,0,1,2, target = 1
        while(start < end) {
            if (nums[start] + nums[end] > target) {
                end--;
            } else if (nums[start] + nums[end] < target) {
                start++;
            } else { // target = 1, nums[2] = -1 nums[5] = 2

                inner.add(-target);
                inner.add(nums[start]);
                inner.add(nums[end]);
                if(!set.contains(inner)) {
                    set.add(inner);
                    result.add(inner);
                }
                inner = new ArrayList<>();
                start++;
                end--;
            }
        }
    }
}
