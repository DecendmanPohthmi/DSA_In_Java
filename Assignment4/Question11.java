package Assignment4;

import java.util.*;
public class Question11 {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        int total_zero = 0;
        for(int i = 0; i < n; i++){
            if(arr[i] == 0){
                total_zero++;
            }
        }

        for(int i = 0; i < total_zero; i++){
            arr[i] = 0;
        }

        for(int i = total_zero; i < n; i++){
            arr[i] = 1;
        }

		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}

        sc.close();
    }
}
