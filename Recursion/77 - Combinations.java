class Solution {
    public static void helper(int ind,int n,int k,List<Integer> al,List<List<Integer>> ans){
        if(al.size() == k){
            ans.add(new ArrayList<>(al));
            return;
        }
        for(int i = ind;i<=n;i++){
            al.add(i);
            helper(i+1,n,k,al,ans);
            al.remove(al.size()-1);
        }
    }
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> al = new ArrayList<>();
        helper(1,n,k,al,ans);
        return ans;
    }
}