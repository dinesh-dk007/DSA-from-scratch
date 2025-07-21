class Solution {
    public int longestSubarray(int[] nums, int k) {
       int left = 0;
       int right = 0;
       int sum = nums[0];
       int n = nums.length;
       int maxlen = 1;
       while(right < n){
            while(left <= right && sum > k){
                sum -= nums[left];
                left++;
            }
            if(sum == k){
            maxlen = Math.max(maxlen,right-left+1);
            }
            right++;
            if(right < n) sum += nums[right];
       }
       return maxlen;
    }
}