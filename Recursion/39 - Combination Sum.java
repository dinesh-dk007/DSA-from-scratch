class Solution {
    public void subSequence(int ind,int [] arr,int target,int n,List<List<Integer>> ans,List<Integer> al){
        if(ind == n){
            if(target == 0){
                ans.add(new ArrayList<>(al));
            }
            return;
        }
        if(arr[ind] <= target){
            al.add(arr[ind]);
            subSequence(ind,arr,target-arr[ind],n,ans,al);
            al.remove(al.size()-1);
        }
        subSequence(ind+1,arr,target,n,ans,al);
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        int n = candidates.length;
        ArrayList<Integer> al =new ArrayList<>();
        subSequence(0,candidates,target,n,ans,al);
        return ans;
    }
}