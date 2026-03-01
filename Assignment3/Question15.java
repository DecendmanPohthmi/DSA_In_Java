package Assignment3;

import java.util.*;
public class Question15 {
	public static int find_decimal(int sb, int sf) {
		int power = 1;
		int result = 0;
		while(sf > 0) {
			int digit = sf % 10;
			result += digit * power;
			power *= sb;
			sf /= 10;
		}
		return result;
	}

	public static int to_des(int dn,int decimal) {
		int result = 0;
		int power = 1;
		while(decimal > 0) {
			int digit = decimal % dn;
			result += digit * power;
			power *= 10;
			decimal /= dn;
		}
		return result;
	}

    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int sb = sc.nextInt();
		int dn = sc.nextInt();
		int sf = sc.nextInt();

		int decimal = find_decimal(sb, sf);
		int result = to_des(dn, decimal);
		System.out.println(result);

        sc.close();
    }
}
