class Solution {
    public String LCS(String s1,String s2){
        int n = s1.length();
        int m = s2.length();
        int [][] dp = new int [n+1][m+1];
        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=m;j++){
                if(s1.charAt(i-1) == s2.charAt(j-1)){
                    dp[i][j] = 1 + dp[i-1][j-1];
                }else{
                    dp[i][j] = Math.max(dp[i][j-1],dp[i-1][j]);
                }
            }
        }
        int i = n,j = m;
        StringBuilder sb = new StringBuilder();
        while(i >0  && j >0){
            if(s1.charAt(i-1) == s2.charAt(j-1)){
                sb.append(s1.charAt(i-1));
                i--;
                j--;
            }else if(dp[i][j-1] > dp[i-1][j]){
                sb.append(s2.charAt(j-1));
                j--;
            }else{
                sb.append(s1.charAt(i-1));
                i--;
            }
        }
        while(i > 0){
            sb.append(s1.charAt(i-1));
            i--;
        }
        while(j > 0){
            sb.append(s2.charAt(j-1));
            j--;
        }
        return sb.reverse().toString();
    }
    public String shortestCommonSupersequence(String str1, String str2) {
        return LCS(str1,str2);
    }
}