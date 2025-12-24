class Solution {
    public int minDifference(int[] arr, int n) {
        int totSum = 0;

        for (int i = 0; i < n; i++) {
            totSum += arr[i];
        }

        boolean[][] dp = new boolean[n][totSum + 1];

        for (int i = 0; i < n; i++) {
            dp[i][0] = true;
        }

        if (arr[0] <= totSum)
            dp[0][arr[0]] = true;

        for (int ind = 1; ind < n; ind++) {
            for (int target = 1; target <= totSum; target++) {
                boolean notTaken = dp[ind - 1][target];

                boolean taken = false;
                if (arr[ind] <= target)
                    taken = dp[ind - 1][target - arr[ind]];

                dp[ind][target] = notTaken || taken;
            }
        }

        int mini = Integer.MAX_VALUE;
        for (int i = 0; i <= totSum; i++) {
            if (dp[n - 1][i]) {

                int diff = Math.abs(i - (totSum - i));
                mini = Math.min(mini, diff);
            }
        }
        return mini;
    }
}
