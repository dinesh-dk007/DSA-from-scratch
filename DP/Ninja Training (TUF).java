class Solution {

    public int helper(int ind, int prev, int n, int[][] arr, int[][] dp) {
        if (ind >= n) return 0;

        if (dp[ind][prev] != -1) return dp[ind][prev];

        int max = 0;

        for (int i = 0; i < 3; i++){
            if (i != prev) {
                max = Math.max(
                    max,
                    arr[ind][i] + helper(ind + 1, i, n, arr, dp)
                );
            }
        }

        dp[ind][prev] = max;
        return max;
    }

    public int ninjaTraining(int[][] matrix) {
        int n = matrix.length;

        int[][] dp = new int[n][4];
        for (int i = 0; i < n; i++) {
            Arrays.fill(dp[i], -1);
        }

        return helper(0, 3, n, matrix, dp);
    }
}
