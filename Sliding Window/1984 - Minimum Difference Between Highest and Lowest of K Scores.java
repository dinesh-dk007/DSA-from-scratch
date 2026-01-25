class Solution {
    public int minimumDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int left =0, right = 0;
        int n = nums.length;
        int min = Integer.MAX_VALUE;
        while(right < n){
            int len = right-left+1;
            if(len == k){
                min = Math.min(min,(nums[right]-nums[left]));
                left++;
            }
            right++;
        }
        return min;
    }
}