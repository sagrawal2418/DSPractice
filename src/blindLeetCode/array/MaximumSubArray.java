package blindLeetCode.array;

public class MaximumSubArray {

    public static void main(String[] args) {
        maxSubArray(new int[]{5,4,-1,7,8});
    }

    public static int maxSubArray(int[] nums) {

        int maxSoFar = nums[0];
        int maxEndingHere = nums[0];

        for(int i = 1; i<nums.length; i++){
            maxEndingHere = Math.max(maxEndingHere + nums[i], nums[i]);
            maxSoFar = Math.max(maxSoFar,maxEndingHere);
        }

        return maxSoFar;
    }
}
