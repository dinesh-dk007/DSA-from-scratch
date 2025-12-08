class LinkedListStack {
    LinkedList<Integer> list;
    public LinkedListStack() {
        list = new LinkedList<Integer>();
    }

    public void push(int x) {
       list.add(x);
    }

    public int pop() {
        if(list.isEmpty())return -1;
        return list.remove(list.size()-1);
    }

    public int top() {
        return list.get(list.size()-1);
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }
}
