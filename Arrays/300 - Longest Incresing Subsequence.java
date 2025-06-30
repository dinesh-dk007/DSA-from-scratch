class Solution {
    public int lengthOfLIS(int[] nums) {
        int [] count = new int [nums.length];
        int maxCount = 1;
        for(int i = 0;i<nums.length;i++){
            count[i] = 1;
            for(int j = 0;j<i;j++){
                if(nums[j] < nums[i]){
                    count[i] = Math.max(count[i],count[j]+1);
                }
            }
            maxCount = Math.max(maxCount,count[i]);
        }
        return maxCount;
    }
}