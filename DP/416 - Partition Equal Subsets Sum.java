class Solution {
    public static boolean targetSubSet(int [] arr,int k){
        boolean [][] dp = new boolean[arr.length][k+1];
        for(int i = 0;i< arr.length;i++){
            dp[i][0] = true;
        }
        if(arr[0] <= k)dp[0][arr[0]] = true;
        for(int i = 1;i<arr.length;i++){
            for(int target = 1;target <= k;target++){
                boolean notTake = dp[i-1][target];
                boolean take  = false;
                if(arr[i] <= target){
                    take =  dp[i-1][target-arr[i]];
                }
                dp[i][target] = notTake || take;
            }
        }
        return dp[arr.length-1][k];
    }
    public boolean canPartition(int[] nums) {
        int n = nums.length;
        int sum = 0;
        for(int i : nums)sum += i;
        if(sum%2 != 0)return false;
        return targetSubSet(nums,sum/2);
    }
}