class Solution {
    public int wiggleMaxLength(int[] nums) {
        if(nums.length == 1)return 1;
        int prev = nums[1]-nums[0];
        int count = (prev!=0)?2:1;
        int n = nums.length;
        for(int i = 2;i<n;i++){
            int current = nums[i]-nums[i-1];
            if((current > 0 && prev <= 0) || (current < 0 && prev >= 0)){
                count++;
                prev = current;
            }
        }
        return count;
    }
}