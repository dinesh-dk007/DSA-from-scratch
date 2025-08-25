class Solution {
    public boolean check(int[] nums) {
        int flag = 0;
        for(int i = 1;i<nums.length;i++){
            if(nums[i-1] > nums[i]){
                flag++;
            }
        }
        if(flag == 0)return true;
        else if(flag == 1){
            for(int i = 1;i<nums.length;i++){
                if(nums[i-1] > nums[i]){
                    if(nums[0] >= nums[nums.length-1])return true;
                }
            }
        }
        return false;
    }
}