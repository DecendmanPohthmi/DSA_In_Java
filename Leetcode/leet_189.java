package Leetcode;

public class leet_189 {
    public static void rotate_array(int[] nums, int start, int end) {
        while (start < end) {
            int a = nums[start];
            int b = nums[end];
            nums[start] = b;
            nums[end] = a;
            start++;
            end--;
        }
    }

    public static void rotate(int[] nums, int k) {
        int n = nums.length;
        k=k%n;
        rotate_array(nums, 0, n - 1);
        rotate_array(nums, 0, k - 1);
        rotate_array(nums, k, n - 1);

        for(int x: nums) {
            System.out.print(x + " ");
        }

    }

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7};
        int k = 3;
        rotate(array, k);
    }
}
