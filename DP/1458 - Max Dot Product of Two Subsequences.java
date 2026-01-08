class Solution {
    public int helper(int i,int j,int n,int m,int [] arr,int []brr,int [][]dp){
        if(i == n || j == m)return Integer.MIN_VALUE;
        if(dp[i][j] != Integer.MIN_VALUE)return dp[i][j];
        int take = arr[i]*brr[j] + Math.max(0,helper(i+1,j+1,n,m,arr,brr,dp));
        int skip_arr = helper(i+1,j,n,m,arr,brr,dp);
        int skip_brr = helper(i,j+1,n,m,arr,brr,dp);

        dp[i][j] = Math.max(take,Math.max(skip_arr,skip_brr));
        return dp[i][j];
    }
    public int maxDotProduct(int[] nums1, int[] nums2) {
        int n =nums1.length, m = nums2.length;
        int [][] dp = new int [n][m];
        for(int i = 0;i<n;i++)Arrays.fill(dp[i],Integer.MIN_VALUE);
        return helper(0,0,n,m,nums1,nums2,dp);
    }
}