class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Integer> stk =new Stack<>();
        for(int i = 0;i<num.length();i++){
            int n = num.charAt(i)-'0';
            while(!stk.isEmpty() && k > 0 && stk.peek() > n){
                stk.pop();
                k--;
            }
            stk.push(n);
        }
        while (k > 0 && !stk.isEmpty()){
            stk.pop();
            k--;
        }
        StringBuilder sb = new StringBuilder();
        while (!stk.isEmpty()) {
            sb.append(stk.pop());
        }
        sb.reverse();
        int idx = 0;
        while (idx < sb.length() && sb.charAt(idx) == '0'){
            idx++;
        }
        sb = sb.substring(idx).length() == 0 ? new StringBuilder("0") : new StringBuilder(sb.substring(idx));
        return sb.toString();
    }
}