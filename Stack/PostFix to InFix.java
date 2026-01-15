class Solution {
    public String postToInfix(String postExp) {
        // Your code goes here
        Stack<String> stk = new Stack<>();
        for(char c : postExp.toCharArray()){
            if(Character.isLetterOrDigit(c)){
                stk.push(c+"");
            }else{
                String c1 = stk.pop()+"";
                String c2 = stk.pop()+"";
                stk.push(new StringBuilder("("+c2+(c+"")+c1+")").toString());
            }
        }
        return stk.peek();
    }
}
