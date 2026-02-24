package CW.Lecture15;

public class pivot_index {
    public static int pivotIndex(int[] nums) {
        int totalSum = 0;
        for (int n : nums) totalSum += n;
        int leftSum = 0;
        for (int i = 0; i < nums.length; i++) {
            int rightSum = totalSum - leftSum - nums[i];
            if (leftSum == rightSum) {
                return i;
            }
            leftSum += nums[i];
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] array = {1,7,3,6,5,6};
        int result = pivotIndex(array);
        System.out.println(result+ " ");
    }
}
