package Leetcode.hard;

public class leet_42 {
    public static int trap(int[] height) {
        int n = height.length;
        int[] maxLeft = new int[n];
        int[] maxRight = new int[n];

        maxLeft[0] = height[0];
        int left = height[0];
        for(int l = 1; l < n; l++) {
            if(height[l] > left) {
                maxLeft[l] = height[l];
            } else {
                maxLeft[l] = left;
            }

            if(height[l] > left) {
                left = height[l];
            }
        }

        maxRight[n - 1] = height[n - 1];
        int right = height[n - 1];
        for(int r = n - 2; r >= 0; r--) {
            if(height[r] > right) {
                maxRight[r] = height[r];
            } else {
                maxRight[r] = right;
            }

            if(height[r] > right) {
                right = height[r];
            }
        }
        
        int result = 0;
        for(int i = 0; i < n; i++) {
            int num = (Math.min(maxLeft[i], maxRight[i]) - height[i]);
            result += num;
        }

        return result;
    }
    public static void main(String[] args) {
        int[] array = {4,2,0,3,2,5};
        int result = trap(array);
        System.out.println(result);
    }
}
