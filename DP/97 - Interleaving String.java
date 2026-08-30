class Solution {

    public boolean helper(int i, int j, String s1, String s2, String s3,Boolean[][] dp) {
        int z = i + j;
        if (z == s3.length()) {
            return i == s1.length() && j == s2.length();
        }
        if (dp[i][j] != null) {
            return dp[i][j];
        }
        boolean ans = false;
        if (i < s1.length() && s1.charAt(i) == s3.charAt(z)) {
            ans = helper(i + 1, j, s1, s2, s3, dp);
        }
        if (!ans && j < s2.length() && s2.charAt(j) == s3.charAt(z)) {
            ans = helper(i, j + 1, s1, s2, s3, dp);
        }

        return dp[i][j] = ans;
    }
    public boolean isInterleave(String s1, String s2, String s3) {
        if (s1.length() + s2.length() != s3.length()) {
            return false;
        }
        Boolean[][] dp = new Boolean[s1.length() + 1][s2.length() + 1];
        return helper(0, 0, s1, s2, s3, dp);
    }
}