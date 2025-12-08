class MyQueue {
    Stack<Integer> stk;
    int size = 0;
    public MyQueue() {
        stk = new Stack();
        size = 0;
    }
    
    public void push(int x) {
        Stack<Integer> temp = new Stack<>();
        while(!stk.isEmpty()){
            temp.push(stk.pop());
        }
        stk.push(x);
        while(!temp.isEmpty()){
            stk.push(temp.pop());
        }
    }
    
    public int pop() {
        return stk.pop();
    }
    
    public int peek() {
        return stk.peek();
    }
    
    public boolean empty() {
        return stk.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */