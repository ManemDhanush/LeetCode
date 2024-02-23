// https://leetcode.com/problems/min-stack/

class MinStack {
public:

    // creation of a stack and min variable
    // stack is designed in such a way that pair consists the value and the current minimum element in the stack
    stack<pair<int, int>> stk;
    int min = INT_MAX;
    MinStack() {
    }
    
    void push(int val) {
        // checking if the current val is lower than the min
        min = val < min ? val : min;
        // pushing the current lowest with the current val
        stk.push(make_pair(val, min));
    }
    
    void pop() {
        stk.pop();
        // assigning the current min val bu checking the top's attached min
        min = !stk.empty() ? stk.top().second : INT_MAX;
    }
    
    int top() {
        return stk.top().first;
    }
    
    int getMin() {
        return stk.top().second;
    }
};

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack* obj = new MinStack();
 * obj->push(val);
 * obj->pop();
 * int param_3 = obj->top();
 * int param_4 = obj->getMin();
 */