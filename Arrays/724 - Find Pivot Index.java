class Solution {
    public int pivotIndex(int[] nums) {
        int n = nums.length;
        int sum = 0;
        for(int i : nums)sum += i;
        int temp = 0;
        int right = 0;
        while(right < n){
            int rem = sum-temp-nums[right];
            if(rem == temp)return right;
            temp += nums[right];
            right++;
        }
        return -1;
    }
}