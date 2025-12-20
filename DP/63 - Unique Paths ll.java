class Solution {
    public int helper(int i,int j,int [][] arr,int [][]dp){
        if(i < 0 || j < 0 || arr[i][j] == 1)return 0;
        if(i == 0 && j == 0)return 1;
        if(dp[i][j] != -1)return dp[i][j];
        int up = helper(i-1,j,arr,dp);
        int left = helper(i,j-1,arr,dp);
        dp[i][j] = up+left;
        return dp[i][j];
    }
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int n = obstacleGrid.length;
        int m = obstacleGrid[0].length;
        int [][] dp = new int [n][m];
        for(int i = 0;i<n;i++)Arrays.fill(dp[i],-1);
        return helper(n-1,m-1,obstacleGrid,dp);
    }
}