package Assignment4;

import java.util.*;
public class Question7 {
    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- >0 ){
			int c1 = sc.nextInt();
			int c2 = sc.nextInt();
			int c3 = sc.nextInt();
			int c4 = sc.nextInt();

			int r = sc.nextInt();
			int c = sc.nextInt();

			int rCost = 0;

			for(int i = 0; i < r; i++ ){
				int rides = sc.nextInt();
				rCost += Math.min(rides*c1 , c2);
			}
			rCost = Math.min(rCost , c3);

			int cabCost = 0;
			for(int i = 0 ; i < c; i++){
				int rides = sc.nextInt();
				
				cabCost += Math.min(rides*c1, c2); 
			}
			cabCost = Math.min(cabCost, c3);

			int ans = Math.min(rCost  + cabCost , c4);
			System.out.println(ans);
			
		}

        sc.close();
		
    }
}
