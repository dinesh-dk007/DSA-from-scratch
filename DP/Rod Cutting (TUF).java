class Solution{
    public int helper(int ind,int n,int [] price,int len,int val,int [][]dp){
        if(len == n)return val;
        if(ind >= price.length)return val;
        if(dp[ind][len] != -1)return dp[ind][len];
        int notTake = helper(ind+1,n,price,len,val,dp);
        int take = Integer.MIN_VALUE;
        if(len+ind+1 <= n){
            take = helper(ind,n,price,len+ind+1,val+price[ind],dp);
        }
        dp[ind][len] =  Math.max(take,notTake);
        return dp[ind][len];
    }
    public int RodCutting(int price[], int n) {
        int [][] dp = new int [price.length][n+1];
        for(int i = 0;i<price.length;i++)Arrays.fill(dp[i],-1);
        return helper(0,n,price,0,0,dp);
    }
}