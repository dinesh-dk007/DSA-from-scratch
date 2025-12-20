class Solution {
    public int helper(int ind,int heights[],int dp[]){
        if(ind == heights.length-1)return 0;
        if(dp[ind] != -1)return dp[ind];
        int jump1 = helper(ind+1,heights,dp)+Math.abs(heights[ind]-heights[ind+1]);
        int jump2 = Integer.MAX_VALUE;
        if(ind+2 < heights.length){
            jump2 = helper(ind+2,heights,dp)+Math.abs(heights[ind]-heights[ind+2]); 
        }
        dp[ind] = Math.min(jump1,jump2);
        return dp[ind];
    }
    public int frogJump(int[] heights) {
        int n = heights.length;
        int [] dp = new int [n];
        Arrays.fill(dp,-1);
        return helper(0,heights,dp);
    }
}