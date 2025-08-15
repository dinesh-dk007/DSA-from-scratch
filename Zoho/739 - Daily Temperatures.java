class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        Stack<Integer> stk = new Stack<>();
        int [] res = new int[n];
        for(int i = 0;i<n;i++){
            while(!stk.isEmpty() && temperatures[i] > temperatures[stk.peek()]){
                int val = stk.pop();
                res[val] = i-val;
            }
            stk.push(i);
        }
        return res;
    }
}