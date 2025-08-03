class Solution {
    public int removeDuplicates(int[] nums) {
        Set<Integer> s = new TreeSet<Integer>();
        for(int i = 0;i<nums.length;i++){
            s.add(nums[i]);}
        int n = 0;
        for(int x : s){
                nums[n++] = x;
        } 
        return s.size();
    }
}