class Solution {
    public int helper(int i,int j,int[][] dp){
        if(i == 0 && j == 0){
            return 1;
        }
        if(i < 0 || j < 0){
            return 0;
        }
        if(dp[i][j] != -1)return dp[i][j];
        int left = helper(i,j-1,dp);
        int right = helper(i-1,j,dp);
        dp[i][j] = left+right;
        return dp[i][j];
    }
    public int uniquePaths(int n, int m) {
        int dp [][] = new int [n][m];
        for(int i = 0;i<n;i++)Arrays.fill(dp[i],-1);
        return helper(n-1,m-1,dp);
    }
}