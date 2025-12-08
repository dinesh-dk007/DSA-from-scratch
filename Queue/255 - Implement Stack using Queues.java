class MyStack {
    Queue<Integer> queue;
    int size;
    int top;
    public MyStack() {
        queue = new LinkedList<Integer>();
        size = 0;
        top = -1;
    }
    
    public void push(int x) {
        queue.add(x);
        size = queue.size();
        for(int i = 1;i<size;i++){
            queue.add(queue.remove());
        }
    }
    
    public int pop() {
        return queue.remove();
    }
    
    public int top() {
        return queue.peek();
    }
    
    public boolean empty() {
        return queue.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */