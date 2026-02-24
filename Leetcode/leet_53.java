package Leetcode;

public class leet_53 {
    public static int maxSubArray(int[] nums) {

        //kadane's Algorithm

        int subArray = Integer.MIN_VALUE;
        int sum = 0;
        for(int i = 0; i < nums.length; i++) {
            if(sum < 0) {
                sum = 0;
            }
            sum += nums[i];
            subArray = Math.max(subArray, sum);
        }
        return subArray;
    }

    public static void main(String[] args) {
        int[] array = {-2,1,-3,4,-1,2,1,-5,4};
        int result = maxSubArray(array);
        System.out.println(result+ " ");
    }
}
