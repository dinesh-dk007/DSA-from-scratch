class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int right = 0;
        int sum = 0;
        Map<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        int count = 0;
        while(right < nums.length){
            sum += nums[right];
            int diff = sum - goal;
            if(map.containsKey(diff)){
                count += map.get(diff);
            }
            map.put(sum,map.getOrDefault(sum,0)+1);
            right++;
        }
        return count;
    }
}