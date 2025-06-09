class MyStack {
    Queue<Integer>Qu=new LinkedList<>();
    
    public MyStack() {
        
    }
    
    public void push(int x) {
        int s=Qu.size();
        Qu.add(x);
        for(int i=0;i<s;i++){
            Qu.add(Qu.peek());
            Qu.remove();
        }
        
    }
    
    public int pop() {
        // if(!Qu.isEmpty()){
        //     return 0;
        // }
        return Qu.remove();
    }
    
    public int top() {
        // if(!Qu.isEmpty()){
        //     return 0;
        // }
        return Qu.peek();
    }
    
    public boolean empty() {
        return Qu.isEmpty();
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