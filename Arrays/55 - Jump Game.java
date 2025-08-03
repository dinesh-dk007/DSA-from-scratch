class Solution {
    public boolean canJump(int[] nums) {
        if(nums.length == 1)return true;
        int jump = 0;
        for(int i = 0;i<nums.length && i<=jump;i++){
            jump= Math.max(jump,i+nums[i]);
           // i = jump;
        }
        return jump >= nums.length-1;
    }
}