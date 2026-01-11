class MinStack {
    Stack<Long> stk;
    long min;
    public MinStack() {
        stk = new Stack<>();
        min = Long.MAX_VALUE;
    }
    
    public void push(int val) {
        if(stk.isEmpty()){
            stk.push((long)val);
            min = val;
        }
        else{
            if(min > val){
                stk.push(2L*val-min);
                min = (long)val;
            }else{
                stk.push((long)val);
            }
        }
    }
    
    public void pop() {
        if(stk.isEmpty())return;
        long val = stk.peek();
        stk.pop();
        if(val < min){
            min = (2L*min-val);
        }
    }
    
    public int top() {
        if(stk.isEmpty())return -1;
        long x = stk.peek();
        if(min < x){
            return (int)x;
        }
        return (int)min;
    }
    
    public int getMin() {
        return (int) min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */