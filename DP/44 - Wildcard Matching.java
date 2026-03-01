class Solution {
    public boolean solve(int i,int j,String s1,String s2,int [][]dp){
        if(i < 0 && j < 0){
            return true;
        }
        if(j < 0 && i >=0){
            return false;
        }
        if(i < 0 && j >= 0){
            for(int k = 0;k<=j;k++){
                if(s2.charAt(k) != '*')return false;
            }
            return true;
        }
        if(dp[i][j] != -1)return dp[i][j] == 1?true:false;
        boolean res1 = false;boolean res2 = false;
        if(s1.charAt(i) == s2.charAt(j) || s2.charAt(j) == '?'){
            res1 = solve(i-1,j-1,s1,s2,dp);
        }
        if(s2.charAt(j) == '*'){
            res2 = (solve(i-1,j,s1,s2,dp) || solve(i,j-1,s1,s2,dp));
        }
        if((res1 || res2)){
            dp[i][j] = 1;
        }else{
            dp[i][j] = 0;
        }
        return dp[i][j] == 1?true:false;
    }
    public boolean isMatch(String s, String p) {
        int n = s.length();
        int m = p.length();
        int [][] dp = new int [n][m];
        for(int i = 0;i<n;i++){
            Arrays.fill(dp[i],-1);
        }
        return solve(n-1,m-1,s,p,dp);
    }
}