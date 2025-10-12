class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;
        Set<Integer> set = new HashSet<>();
        for(int i : nums){
            set.add(i);
        }
        int ans = 0;
        for(int i : nums){
            int streak = 0;
            int current = i;
            while(set.contains(current)){
                streak++;
                current++;
            }
            ans = Math.max(ans,streak);
        }
        return ans;
    }
}
