class Solution {
    public int longestOnes(int[] nums, int k) {
        int maxlen = 0;
        int right = 0;
        int left = 0;
        int count_zeros = 0;
        while(right < nums.length){
            if(nums[right] == 0)count_zeros++;
            while(count_zeros > k){
                if(nums[left] == 0)count_zeros--;
                left++;
            } 
            if(count_zeros <= k){
                int len = right - left + 1;
                maxlen = Math.max(len,maxlen);
            }
            right++;
        }
        return maxlen;
    }
}