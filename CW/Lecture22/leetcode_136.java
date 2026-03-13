package CW.Lecture22;

import java.util.Arrays;

public class leetcode_136 {
    public int singleNumber(int[] nums) {
       Arrays.sort(nums);
        int i = 0;
        while(i < nums.length - 1) {
            int temp = nums[i] ^ nums[i+1];
            if(temp == 0) {
                i += 3;
            } else {
                return nums[i];
            }
        }
        return nums[nums.length - 1];
    }
}
