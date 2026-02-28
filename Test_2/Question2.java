//trapping rain water
package Test_2;

public class Question2 {

    public static int trapping_rain_water(int[] nums) {
        int[] prefix = new int[nums.length];
        int[] suffix = new int[nums.length];
        int n = nums.length;

        prefix[0] = nums[0];
        for(int i = 1; i < n; i++) {
            if(prefix[i-1] > nums[i]) {
                prefix[i] = prefix[i-1];
            } else {
                prefix[i] = nums[i];
            }
        }

        suffix[n-1] = nums[n-1];
        for(int i = n-2; i>= 0; i--) {
            if(suffix[i+1] > nums[i]) {
                suffix[i] = suffix[i+1];
            } else {
                suffix[i] = nums[i];
            }
        }

        int total_water = 0;
        for(int i = 0; i<n; i++) {
            total_water += Math.min(prefix[i], suffix[i]) - nums[i];
        }
        return total_water;
    }
    public static void main(String[] args) {
        int[] nums = {0,1,0,2,1,0,1,3,2,1,2,1};
        int result = trapping_rain_water(nums);
        System.out.println(result);
    }
}
