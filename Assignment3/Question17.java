package Assignment3;

import java.util.*;
public class Question17 {
	public static void game_play(int m, int n) {
		int A = 0;
		int H = 0;
		int count = 1;
		while(true) {
			if(count % 2 == 0) {
				if (H + count > n) {
                    System.out.println("Aayush");
                    break;
                }
				H += count;
			} else {
				if (A + count > m) {
                    System.out.println("Harshit");
                    break;
                }
				A += count;
			}
			count++;
		}
	} 

    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int game = sc.nextInt();
		while(game > 0) {
			int M = sc.nextInt();
			int N = sc.nextInt();
			game_play(M,N);
			game--;
		}
        sc.close();
    }
}
