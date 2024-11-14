public class LeetCodeOneThreeFour {
    public static void main(String[] args) {
        int[] gas = {1,2,3,4,5};
        int[] cost = {3,4,5,1,2};
        System.out.println(canCompleteCircuit(gas,cost));
    }
    static int canCompleteCircuit(int[] gas, int[] cost) {
        int sumgas = 0;
        for (int j : gas) {
            sumgas += j;
        }
        int sumcost = 0;
        for(int i : cost){
            sumcost += i;
        }

        if(sumgas < sumcost){
            return -1;
        }

        int total = 0;
        int start = 0;
        for (int i = 0; i < gas.length; i++) {
            total += (gas[i] - cost[i]);
            if (total < 0){
                total=0;
                start = i+1;
            }
        }
        return start;
    }
}
