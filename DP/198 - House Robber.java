class Solution {
    public int helper(int ind,int n,int [] arr,int []dp){
        if(ind >= n)return 0;
        if(dp[ind] != -1)return dp[ind];
        int take = arr[ind] + helper(ind+2,n,arr,dp);
        int notTake = helper(ind+1,n,arr,dp);
        dp[ind] = Math.max(take,notTake);
        return dp[ind];
    }
    public int rob(int[] nums) {
        int n = nums.length;
        int [] dp = new int [n];
        Arrays.fill(dp,-1);
        return helper(0,n,nums,dp);
    }
}