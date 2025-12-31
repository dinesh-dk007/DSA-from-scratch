class Solution {
    public int helper(int ind,int n,int weight,int curr,int value,int wt[],int val[],int [][] dp){
        if (curr > weight) return Integer.MIN_VALUE;
        if (curr == weight) return value;
        if (ind >= n) return value;
        if(dp[ind][curr] != -1)return dp[ind][curr];
        int notTake = helper(ind+1,n,weight,curr,value,wt,val,dp);
        int take = Integer.MIN_VALUE;
        if(curr+wt[ind] <= weight){
            take = helper(ind,n,weight,curr+wt[ind],value+val[ind],wt,val,dp);
        }
        dp[ind][curr]= Math.max(notTake,take);
        return dp[ind][curr];
    }
    public int unboundedKnapsack(int[] wt, int[] val, int n, int W) {
        int [][] dp = new int [n][W+1];
        for(int i =0;i<n;i++)Arrays.fill(dp[i],-1);
        return helper(0,n,W,0,0,wt,val,dp);
    }
}
