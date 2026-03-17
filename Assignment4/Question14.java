package Assignment4;

import java.util.*;
public class Question14 {
    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();

		while(test-- > 0) {
			int n1 = sc.nextInt();
			int n2 = sc.nextInt();

			int[] array1 = new int[n1];
			int[] array2 = new int[n2];

			for(int i = 0; i < n1; i++) array1[i] = sc.nextInt();
			for(int i = 0; i < n2; i++) array2[i] = sc.nextInt();

			int total_sum = 0;

			int i = 0, j = 0;
			int count_1 = 0;
			int count_2 = 0;
			while(i < n1 && j < n2) {
				if(array1[i] < array2[j]) {
					count_1 += array1[i];
					i++;
				}
				else if(array2[j] < array1[i]) {
					count_2 += array2[j];
					j++;
				}
				else {
					total_sum += Math.max(count_1, count_2) + array2[j];
					count_1 = 0;
					count_2 = 0;
					i++;
					j++;
				}
			}

			while(i < n1) {
				count_1 += array1[i];
				i++;
			}

			while(j < n2) {
				count_2 += array2[j];
				j++;
			}

			total_sum += Math.max(count_1, count_2);

			System.out.println(total_sum);
		}

        sc.close();
    }
}
