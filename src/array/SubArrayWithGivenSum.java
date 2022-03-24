package array;

import java.util.ArrayList;

public class SubArrayWithGivenSum {

    public static void main(String[] args) {
        System.out.println(subarraySum(new int[]{1, 2, 3, 7, 5}, 5, 12));
    }

    //Function to find a continuous sub-array which adds up to a given number.
    private static ArrayList<Integer> subarraySum(int[] arr, int n, int s) {

        int currentSum = 0;
        int left = 1;
        int right = 0;
        ArrayList<Integer> list = new ArrayList<>();

        if (arr.length == 0) {
            list.add(-1);
            return list;
        }

        int i = 0;
        while (i < n) {
            if (currentSum != s) if (currentSum < s) {
                currentSum = currentSum + arr[right];
                right++;
                i++;
            } else {
                currentSum = currentSum - arr[left++];
                i++;
            }
        }

        list.add(left);
        list.add(right);
        return list;
    }

}


