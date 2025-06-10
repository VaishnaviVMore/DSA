class MyQueue {
    Stack<Integer>St1=new Stack<>();
    Stack<Integer>St2=new Stack<>();
    public MyQueue() {
        
    }
    
    public void push(int x) {
        while(St1.size()!=0){
            St2.push(St1.peek());
            St1.pop();
        }
        St1.push(x);
        while(St2.size()!=0){
            St1.push(St2.peek());
            St2.pop();
        }
    }
    
    public int pop() {
        return St1.pop();
    }
    
    public int peek() {
        return St1.peek();
    }
    
    public boolean empty() {
        return St1.isEmpty();
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