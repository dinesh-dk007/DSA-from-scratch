class Solution {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int left = 0;
        int right = nums.length-1;
        int max = Integer.MIN_VALUE;
        while(left < right){
            int sum = nums[left]+nums[right];
            max = Math.max(sum,max);
            left++;
            right--;
        }
        return max;

    }
}