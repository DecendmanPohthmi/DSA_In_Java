//missing number

package Test_2;

public class Question1 {
    public static void main(String[] args) {
        int[] data = {3,0,1};
        int n = data.length;

        int total_sum_data = n * (n + 1) / 2;

        int total_sum = 0;
        for(int i = 0; i < n; i++) {
            total_sum = total_sum + data[i];
        }

        System.out.println(total_sum_data - total_sum);
    }
}
