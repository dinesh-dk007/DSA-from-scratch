class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum = 0;
        for(int i = 0;i<k;i++){
            sum += nums[i];
        }
        int max = sum;
        for(int l = k;l<nums.length;l++){
            sum += nums[l];
            sum -= nums[l-k];
            max = Math.max(sum,max);
        }
        return (double) max/k;
    }
}