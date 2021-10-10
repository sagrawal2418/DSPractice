package array;

public class MultiplyLeftAndRightArraySum {

    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 4, 5, 6};
        int sum1 = 0;
        int sum2 = 0;

        for (int i = 0; i < nums.length / 2; i++) {
            sum1 += nums[i];
        }

        for (int j = nums.length / 2; j < nums.length; j++) {
            sum2 += nums[j];
        }

        System.out.println(sum1 * sum2);
    }
}
