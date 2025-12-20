class Solution {
    public int helper(int ind,int n,int []arr,int k,int [] dp){
        if(ind == n-1)return 0;
        if(dp[ind] != -1)return dp[ind];
        int jumps = Integer.MAX_VALUE;
        for(int i = 1;i<=k;i++){
            if(ind+i <= n-1){
                jumps = Math.min(jumps,helper(ind+i,n,arr,k,dp)+Math.abs(arr[ind]-arr[ind+i]));
            }
        }
        dp[ind] = jumps;
        return dp[ind];
    }
    public int frogJump(int[] heights, int k) {
        int n = heights.length;
        int [] dp = new int [n];
        Arrays.fill(dp,-1);
        return helper(0,n,heights,k,dp);
    }
}