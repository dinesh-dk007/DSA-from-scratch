class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        int left = 0;
        int right = 0;
        Map<Integer,Integer> map = new HashMap<>();
        int n = nums.length;
        int maxSum = 0;
        int sum = 0;
        while(right < n){
            if(map.containsKey(nums[right])){
                int ind = map.get(nums[right]);
                maxSum = Math.max(maxSum,sum);
                while(left < right && left <= ind){
                    sum -= nums[left];
                    left++;
                }
                map.put(nums[right],right);
            }
            map.putIfAbsent(nums[right],right);
            sum += nums[right];
            right++;
        }
        maxSum = Math.max(maxSum,sum);
        return maxSum;
    }
}