class Solution {
    public int minimumDeleteSum(String s1, String s2) {
        int n = s1.length();
        int m = s2.length();
        int dp[][] = new int [n+1][m+1];
        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=m;j++){
                if(s1.charAt(i-1) == s2.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1]+(int)(s1.charAt(i-1));
                }else{
                    dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        int total = 0;
        for(int i = 0;i<s1.length();i++){
            total += (int)s1.charAt(i);
        }
        for(int i = 0;i<s2.length();i++){
            total += (int)s2.charAt(i);
        }
        int sum = 2*dp[n][m];
        return total-sum;
    }
}