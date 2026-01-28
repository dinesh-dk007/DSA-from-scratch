class Solution {
    public double helper(int a,int b,double [][]dp){
        if(a <= 0 && b <= 0){
            return 0.5;
        }
        if(a <= 0){
            return 1.0;
        }
        if(b <= 0){
            return 0.0;
        }
        if(dp[a][b] != -1)return dp[a][b];
        dp[a][b] = 0.25*(helper(a-4,b,dp)+helper(a-3,b-1,dp)+helper(a-2,b-2,dp)+helper(a-1,b-3,dp));
        return dp[a][b];

    }
    public double soupServings(int n) {
        if (n >= 4800) return 1.0;
        n = (n + 24) / 25;
        double [][] dp = new double[n+1][n+1];
        for(int i = 0;i<=n;i++)Arrays.fill(dp[i],-1.0);
        return helper(n,n,dp);
    }
}