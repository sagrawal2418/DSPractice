package array;

public class BinarySearch {

    public static void main(String[] args) {

        System.out.println(search(new int[]{-1, 0, 3, 5, 9, 12}, 9));
    }

    public static int search(int[] nums, int target) {

        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
//Left + ( right-left)/2
            int middle = left + (right - left) / 2;
            if (target < nums[middle]) {
                right = middle - 1;

            } else if (target > nums[middle]) {
                left = middle + 1;
            } else {
                return middle;
            }
        }
        return -1;

    }
}
