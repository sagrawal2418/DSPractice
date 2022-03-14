package blindLeetCode.array;

public class MaximumProductSubArray {

    public static void main(String[] args) {
        maxProduct(new int[]{2,-5,-2,-4,3});

    }

    public static int maxProduct(int[] nums) {

        int maxSoFar = nums[0];
        int maxEndingHere = nums[0], minEndingerHere = nums[0], temp = 0;

        for (int i = 1; i < nums.length; i++) {
            temp = maxEndingHere;

            maxEndingHere = Math.max(maxEndingHere * nums[i], Math.max(minEndingerHere * nums[i],nums[i]));
            minEndingerHere = Math.min(temp * nums[i], Math.min(minEndingerHere * nums[i], nums[i]));

            maxSoFar = Math.max(maxSoFar, maxEndingHere);

        }

        System.out.println(maxSoFar);
        return maxSoFar;

    }
}
