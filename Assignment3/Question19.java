package Assignment3;

import java.util.*;
public class Question19 {
	public static boolean even_odd(long num) {
		int odd_sum = 0;
		int even_sum = 0;
		while(num > 0) {
			int digit = (int) (num % 10);
			if(num % 2 == 0) {
				even_sum += digit;
			} else {
				odd_sum += digit;
			}
			num /= 10;
		}
		if(even_sum % 4 == 0 || odd_sum % 3 == 0){
			return true;
		}
		return false;
	}

    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		while(n > 0) {
			long num = sc.nextLong();
			boolean result = even_odd(num);
			if(result) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
			n--;
		}
        sc.close();
    }
}
