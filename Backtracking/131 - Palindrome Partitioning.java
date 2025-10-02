class Solution {
    public boolean isPalindrome(String s,int left ,int right){
        while(left <= right){
            if(s.charAt(left) != s.charAt(right)){
                return false;
            }
            left++;right--;
        }
        return true;
    }
    public void helper(int ind,String s,List<String> al, List<List<String>> ans){
        if(ind == s.length()){
            ans.add(new ArrayList<>(al));
            return;
        }
        for(int i = ind;i<s.length();i++){
            if(isPalindrome(s,ind,i)){
                al.add(s.substring(ind,i+1));
                helper(i+1,s,al,ans);
                al.remove(al.size()-1);
            }
        }
    }
    public List<List<String>> partition(String s) {
        List<List<String>> ans = new ArrayList<>();
        List<String> al = new ArrayList<>();
        helper(0,s,al,ans);
        return ans;
    }
}