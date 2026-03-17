package Assignment4;

import java.util.Scanner;

public class Question24 {
    public static void reverse_array(int[] nums, int start) {
        int end = nums.length - 1;
        while(start <= end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		int size = sc.nextInt();
		int nums[] = new int[size];

		for(int i=0; i<size; i++) {
			nums[i] = sc.nextInt();
		}

		int n = nums.length;

        int idx = -1;
        for(int i = n-2; i >= 0; i--) {
            if(nums[i] < nums[i+1]) {
                idx = i;
                break;
            }
        }

        if(idx != -1) {
            for(int i = n-1; i > idx; i--) {
                if(nums[i] > nums[idx]) {
                    int temp = nums[i];
                    nums[i] = nums[idx];
                    nums[idx] = temp;
                    break;
                }
            }
        }

        reverse_array(nums, idx + 1);

		for(int x: nums) {
			System.out.print(x+" ");
		}

        sc.close();
    }
}
