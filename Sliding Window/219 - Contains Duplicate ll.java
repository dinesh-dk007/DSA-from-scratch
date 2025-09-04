class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int n = nums.length;
        Map<Integer,Integer> map = new HashMap<>();
        int right = 0;
        while(right < n){
            if(map.containsKey(nums[right])){
                int ind1 = map.get(nums[right]);
                int diff = right - ind1;
                if(diff <= k)return true;
            }
            map.put(nums[right],right);
            right++;
        }
        return false;
    }
}