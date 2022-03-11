package blindLeetCode.array;

import java.util.Arrays;

public class ProductOfArrayExceptSelf {

    public static void main(String[] args) {
        productExceptSelf(new int[]{-1,1,0,-3,3});

    }

    public static int[] productExceptSelf(int[] nums) {
        int[] leftArray = new int[nums.length];
        int[] rightArray = new int[nums.length];
        int[] finalArray = new int[nums.length];


        leftArray[0] = 1;
        rightArray[nums.length - 1] = 1;

        for (int i = 1; i < nums.length; i++) {
            leftArray[i] = (leftArray[i - 1]) * (nums[i - 1]);
        }

        for (int i = nums.length - 2; i >= 0; i--) {
            rightArray[i] = (rightArray[i + 1]) * (nums[i + 1]);
        }


        for(int i = 0; i<nums.length; i++){
            finalArray[i] = leftArray[i] * rightArray[i];
        }

        System.out.println(Arrays.toString(leftArray));
        System.out.println(Arrays.toString(rightArray));
        System.out.println(Arrays.toString(finalArray));

        return finalArray;
    }



    /*
[1,2,3,4] ==> 24
[24,12,8,6]


1*2*3*4/2 = 12

for ( 0 to n-1)//multiply all
for()
loop ==> left ==> 1 to n-1
i = 0
left[0] = 1
i = 1
left[i] = left[i-1]*givenARr[i-1] //fixed this to i
i = 3
left[3] = left[2]*givenArr[1]

loop ==> right ==> n-1 to 1
loop ==> right[i] * left[i]

givenArr    [2,3,4,5]  ==> 120
left        [1,2,6,24]
right       [60,20,5,1]
ans         [60,40,30,24]
int ignoringIndex = 2
for(0 to n -1){

}


*/
}
