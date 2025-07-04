class Node {
    int val;
    int minSoFar;

    Node(int val, int minSoFar){
        this.val = val;
        this.minSoFar = minSoFar;
    }
}

class MinStack {

    private Stack<Node> stk;

    public MinStack() {
        stk = new Stack<Node>();
    }
    
    public void push(int val) {
        if(stk.isEmpty()){
            stk.push(new Node(val, val));
        } else {
            stk.push(new Node(val, Math.min(val, stk.peek().minSoFar)));
        }
    }
    
    public void pop() {
        if(!stk.isEmpty()){
            stk.pop();
        }
    }
    
    public int top() {
        if(!stk.isEmpty()) return stk.peek().val;
        return -1;
    }
    
    public int getMin() {
        if(!stk.isEmpty()) return stk.peek().minSoFar;
        return -1;
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