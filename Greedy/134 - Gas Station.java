class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int n = gas.length;
        int sum1 = 0;
        int sum2 = 0;
        for(int i : gas)sum1 += i;
        for(int j : cost)sum2 += j;
        if(sum1 < sum2)return -1;
        int tot = 0;
        int res= 0;
        for(int i = 0;i<n;i++){
            tot += gas[i]-cost[i];
            if(tot < 0){
                tot = 0;
                res = i+1;
            }
        }
        return res;
    }
}