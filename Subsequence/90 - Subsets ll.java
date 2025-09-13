class Solution {
    public void subSets(int ind,int n, List<List<Integer>> ans ,List<Integer> al,int[] nums){
        if(ind == n){
            ans.add(new ArrayList<>(al));
            return;
        }
        al.add(nums[ind]);
        subSets(ind+1,n,ans,al,nums);
        al.remove(al.size()-1);
        while(ind + 1 < n && nums[ind] == nums[ind+1])ind++;
        subSets(ind+1,n,ans,al,nums);
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        subSets(0,nums.length,ans,new ArrayList<Integer>(),nums);
        return ans;
    }
}