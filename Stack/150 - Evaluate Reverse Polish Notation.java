class Solution {
    static int helper(int v1, int v2, String c) {
        switch (c) {
            case "+":
                return v1 + v2;
            case "-":
                return v2 - v1;
            case "*":
                return v1 * v2;
            case "/":
                return v2 / v1;
        }
        return 0;
    }

    public int evalRPN(String[] tokens) {
        Stack<Integer> stk = new Stack<>();
        for (String str : tokens) {
            char ch=str.charAt(0);
        if(Character.isDigit(ch)||(str.length()>1&&ch=='-'&&Character.isDigit(str.charAt(1))))  {
            stk.add(Integer.parseInt(str));
        }else {
                int v1 = stk.pop();
                int v2 = stk.pop();
                int cal = helper(v1, v2, str);
                stk.push(cal);
            }
        }
        return stk.pop();
    }
}
