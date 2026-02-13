class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stk = new Stack<>();
        for(String i : operations){
            switch(i){
                case "C":
                    stk.pop();
                    break;
                case "D":
                    int top = stk.peek();
                    stk.push((top*2));
                    break;
                case "+":
                    int top1 = stk.peek();
                    int prev = stk.get(stk.size()-2);
                    stk.push(top1+prev);
                    break;
                default:
                    stk.push(Integer.parseInt(i));
                    break;
            }
        }
        int sum = 0;
        while(!stk.isEmpty()){
            sum += stk.pop();
        }
        return sum;
    }
}