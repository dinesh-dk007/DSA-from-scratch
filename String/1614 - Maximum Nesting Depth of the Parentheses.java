class Solution {
    public int maxDepth(String s) {
        Stack<Character> stk = new Stack<>();
        int ans = 0;
        for(char c : s.toCharArray()){
            if(Character.isDigit(c))continue;
            if(c == '('){
                stk.push(c);
            }
            else if(c == ')'){
                stk.pop();
            }
            ans = Math.max(ans,stk.size());
        }
        return ans;
    }
}