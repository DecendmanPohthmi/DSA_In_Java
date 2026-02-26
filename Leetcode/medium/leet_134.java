package Leetcode.medium;

public class leet_134 {
    public static int canCompleteCircuit(int[] gas, int[] cost) {
        int n = gas.length;
        
        int total_cost = 0;
        int total_gas = 0;
        for(int i = 0; i<n; i++) {
            total_cost += cost[i];
            total_gas += gas[i];
        }
        if(total_gas < total_cost) return -1;

        int start = 0;
        int tank = 0;
        for(int i = 0; i < n; i++) {
            tank = gas[i] - cost[i];
            if(tank < 0) {
                start ++;
                tank = 0;
            }
        }

        tank = 0;
        for (int i = 0; i < n; i++) {
            int idx = (start + i) % n;
            tank += gas[idx];
            if (tank < cost[idx]) return -1;
            tank -= cost[idx];
        }

        return start;
    }

    public static void main(String[] args) {
       int[] gas = {1,2,3,4,5};
       int[] cost = {3,4,5,1,2};
       int result = canCompleteCircuit(gas, cost);
       System.out.println(result);
    }
}
