package blindLeetCode.array;

public class ContainerWithMostWater {

    public static void main(String[] args) {

        maxArea(new int[]{1, 2, 1});

    }

    public static int maxArea(int[] height) {

        int i = 0;
        int j = height.length-1;
        int maxArea = 0;

        while (i < j){
            maxArea = Math.max(maxArea, Math.min(height[i], height[j]) * (j - i));
            if (height[i] < height[j]) {
                i++;
            } else
                j--;
        }

        System.out.println(maxArea);
        return maxArea;

    }
}
