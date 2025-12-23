class Solution {
    public int helper(int i, int j, String s, String t, int[][] dp) {
        if (j == t.length()) return 1; 
        if (i == s.length()) return 0; 
        if (dp[i][j] != -1) return dp[i][j];
        int count = 0;
        if (s.charAt(i) == t.charAt(j)) {
            count += helper(i + 1, j + 1, s, t, dp);
        }
        count += helper(i + 1, j, s, t, dp);
        return dp[i][j] = count;
    }

    public int numDistinct(String s, String t) {
        int[][] dp = new int[s.length()][t.length()];
        for (int[] row : dp) Arrays.fill(row, -1);
        return helper(0, 0, s, t, dp);
    }
}
