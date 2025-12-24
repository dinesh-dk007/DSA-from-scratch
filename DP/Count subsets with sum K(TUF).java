class Solution {
    public int helper(int ind,int []arr,int target,int [][]dp){
        if(target == 0)return 1;
        if(ind == 0) return target-arr[ind] == 0 ? 1 : 0;
        if(dp[ind][target] != -1)return dp[ind][target];
        int notTake = helper(ind-1,arr,target,dp);
        int take  = 0;
        if(arr[ind] <= target){
            take = helper(ind-1,arr,target-arr[ind],dp);
        }
        dp[ind][target] = take + notTake;
        return dp[ind][target];
    }
    public int perfectSum(int[] arr, int K) {
        int n = arr.length;
        int [][] dp = new int [n][K+1];
        for(int i = 0;i<n;i++){
            Arrays.fill(dp[i],-1);
        }
        return helper(n-1,arr,K,dp);
    }
}

