class MinStack {

     Stack<Integer> st= new Stack();
    Stack<Integer> minSt=new Stack();

    public MinStack() {
        
    }
    
    public void push(int value) {
        st.push(value);
        if(minSt.isEmpty() || value<= minSt.peek())
        minSt.push(value);
        
    }
    
    public void pop() {
        if(st.isEmpty()) return;
        int removed= st.pop();
        if(!minSt.isEmpty() && removed == minSt.peek()) {
        minSt.pop();
        }
        
    }
    
    public int top() {
        if(st.isEmpty()) return -1;
        return st.peek();
        
    }
    
    public int getMin() {
        if(minSt.isEmpty()) return -1;
        return minSt.peek();
        
    }
}

