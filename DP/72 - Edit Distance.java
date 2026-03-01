class Solution {
    public int helper(int i,int j,String s1,String s2,int [][] dp){
        if(i < 0){
            return j+1;
        }
        if(j < 0){
            return i+1;
        }
        if(s1.charAt(i) == s2.charAt(j)){
            return helper(i-1,j-1,s1,s2,dp);
        }
        if(dp[i][j] != -1)return dp[i][j];
        int insert = 1+helper(i,j-1,s1,s2,dp);
        int delete = 1+helper(i-1,j,s1,s2,dp);
        int update = 1+helper(i-1,j-1,s1,s2,dp);
        dp[i][j] = Math.min(insert,Math.min(update,delete));
        return dp[i][j];
    }
    public int minDistance(String word1, String word2) {
        int n = word1.length();
        int m = word2.length();
        int dp[][] =new int [n+1][m+1];
        for(int i = 0;i<n;i++)Arrays.fill(dp[i],-1);
        return helper(n-1,m-1,word1,word2,dp);
    }
}