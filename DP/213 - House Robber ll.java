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
        if(n == 1)return nums[0];
        int [] dp = new int [n];
        int [] dp2 = new int [n];
        Arrays.fill(dp2,-1);
        Arrays.fill(dp,-1);
        int v1 = helper(0,n-1,nums,dp);
        int v2 = helper(1,n,nums,dp2);
        return Math.max(v1,v2);
    }
}