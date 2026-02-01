class Solution {
    public int minimumCost(int[] nums) {
        int k =  nums[0];
        int min1 = 50;
        int min2 = 50;
        for(int i  = 1;i<nums.length;i++){
            if(nums[i] <= min2){
                min1 = min2;
                min2 = nums[i];
            }
            else if(nums[i] <= min1){
                min1 = nums[i];
            }
        }
        return k+min1+min2;
    }
}