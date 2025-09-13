class Solution {
    public void subSets(int ind,int n,List<List<Integer>> ans,List<Integer> al,int [] nums){
        if(ind == n){
            ans.add(new ArrayList<>(al));
            return;
        }
        al.add(nums[ind]);
        subSets(ind+1,n,ans,al,nums);
        al.remove(al.size()-1);
        subSets(ind+1,n,ans,al,nums);
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        subSets(0,nums.length,ans,new ArrayList<>(),nums);
        return ans;
    }
}