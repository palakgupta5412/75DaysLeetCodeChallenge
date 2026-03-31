class MinStack {

    Stack<Long> stck ;
    Long  min ;

    public MinStack() {
        stck = new Stack<>() ;
        min = Long.MAX_VALUE ;    
    }
    
    public void push(int val) {
        
        Long value = Long.valueOf(val) ;
        if(stck.isEmpty()){
            stck.push(value);
            min = value ;
        }
        else{
            if(value>=min){
                stck.push(value);
            }
            else{
                Long newVal = 2*value - min ;
                stck.push(newVal);
                min = value ;
            }
        }
    }
    
    public void pop() {
        
        if(stck.isEmpty()){
            return;
        }
        else{
            if(stck.peek()<=min){
                min = 2*min - stck.peek();
            }
            stck.pop();
        }
    }
    
    public int top() {
        if(stck.isEmpty()){
            return -1;
        }
        else{
            if(stck.peek()<min){
                return min.intValue() ;
            }
            else{
                return stck.peek().intValue();
            }
        }
    }
    
    public int getMin() {
        return min.intValue() ;
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