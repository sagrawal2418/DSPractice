package array;

import java.util.Arrays;
import java.util.HashSet;

public class IntersectionOfTwoArrays {

    public static void main(String[] args) {

       int[] num1 = {4,9,5};
       int[] num2 = {9,4,9,8,4};
        System.out.println(Arrays.toString(intersection(num1, num2)));
    }

        public static int[] intersection(int[] nums1, int[] nums2) {
            HashSet<Integer> set = new HashSet<>();

            if(nums1.length > nums2.length){
                for (int k : nums2) {
                    set.add(k);
                }

                for (int i : nums1) {
                    if (!set.contains(i)) {
                        set.remove(i);
                    }
                }
            }else{
                for (int k : nums1) {
                    set.add(k);
                }

                for (int i : nums2) {
                    if (!set.contains(i)) {
                        set.remove(i);
                    }
                }
            }


            Integer[] arr = set.toArray(new Integer[set.size()]);

            return Arrays.stream(arr).mapToInt(Integer::intValue).toArray();
        }
}
