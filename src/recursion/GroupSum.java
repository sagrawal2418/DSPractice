package recursion;

public class GroupSum {

    public static void main(String[] args) {

        int[] num = {2, 4, 8};
        groupSum(0, num, 10);
    }

    public static boolean groupSum(int start, int[] nums, int target) {//2,4,8

        if (nums.length <= start) {
            return target == 0;
        }

        //1, 2,4,8, 8
        if (groupSum(start + 1, nums, target - nums[start])) {
            System.out.println("subtracted");
            System.out.println("start::"+start + " target::"+target);
            return true;
        }

        if (groupSum(start + 1, nums, target)) {
            System.out.println("start::"+start + " target::"+target);
            return true;
        }

        return false;

    }
}
