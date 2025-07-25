class Solution {
    public int maxSum(int[] nums) {
        if(nums.length == 1)return nums[0];
        Set<Integer> set = new HashSet<>();
        for(int i : nums)set.add(i);
        int sum = 0;
        int ans = Integer.MIN_VALUE;
        boolean hasPositive = false;
        for(int i  : set){
            if( i > 0){
                hasPositive = true;
                sum += i;
            }
            ans = Math.max(ans,i);
        }
        if(hasPositive){
        return sum;
        }
        return ans;

    }
}