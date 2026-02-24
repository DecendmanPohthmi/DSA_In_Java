package Leetcode.medium;

public class leet_238 {
    public static int[] productExceptSelf(int[] nums) {
        int[] prefix = new int[nums.length];
        int[] suffix = new int[nums.length];
        int[] array = new int[nums.length];

        //suffix
        suffix[0] = 1;
        for(int i = 1; i < nums.length; i++) {
            suffix[i] = suffix[i-1] * nums[i-1];
        }

        //prefix
        prefix[nums.length - 1] = 1;
        for (int i = nums.length - 2; i >= 0; i--) {
            prefix[i] = prefix[i + 1] * nums[i + 1];
        }
        
        for(int i = 0; i < nums.length; i++) {
            array[i] = prefix[i] * suffix[i];
        }

        return array;
    }

    public static void main(String[] args) {
        int[] array = {1,2,3,4};
        int[] new_array = productExceptSelf(array);
        for(int x : new_array) {
            System.out.print(x+ " ");
        }
    }
}
