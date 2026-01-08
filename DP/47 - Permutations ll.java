class Solution {
    public static void helper(int n,int [] arr,List<List<Integer>> ans,List<Integer> al,boolean []visited){ 
        if(al.size() == n){
            ans.add(new ArrayList<>(al));
            return;
        }
        for(int i = 0;i<n;i++){
            if(visited[i])continue;
            if(i > 0 && arr[i] == arr[i-1] && !visited[i-1])continue;
            visited[i]  =true;
            al.add(arr[i]);
            helper(n,arr,ans,al,visited);
            al.remove(al.size()-1);
            visited[i] = false;
        }
    }
    public List<List<Integer>> permuteUnique(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        boolean visited[] = new boolean[n];
        List<Integer> al = new ArrayList<>();
        helper(n,nums,ans,al,visited);
        return ans;

    }
}