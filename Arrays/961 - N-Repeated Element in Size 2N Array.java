class Solution {
    public int repeatedNTimes(int[] nums) {
        Set<Integer> hs = new HashSet<>();
        for(int i : nums){
            if(!hs.add(i))return i;
        }
        return -1;
    }
}