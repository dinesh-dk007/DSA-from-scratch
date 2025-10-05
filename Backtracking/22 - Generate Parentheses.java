class Solution {
    public void dfs(String s, int open,int close,int n,List<String> ans){
        if(s.length() == 2*n){
            ans.add(s);
            return;
        }
        if(open < n){
            dfs(s+"(",open+1,close,n,ans);
        }
        if(close < open){
            dfs(s+")",open,close+1,n,ans);
        }
    }
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        dfs("",0,0,n,ans);
        return ans;
    }
}