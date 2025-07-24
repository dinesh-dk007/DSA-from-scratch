class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int close = 100000;
        int n = nums.length;
        for(int i = 0;i<n-2;i++){
            if(i > 0 && nums[i] ==nums[i-1])continue;
            int left = i+1;
            int right = n-1;
            while(left < right){
                int sum = nums[i]+nums[left]+nums[right];
                 if (Math.abs(target - sum) < Math.abs(target - close)) {
                    close = sum;
                }
                if(sum == target){
                    return sum;
                    
                }
                else if(sum < target){
                    left++;
                }else{
                    right--;
                }
            }
        }
        return close;
    }
}