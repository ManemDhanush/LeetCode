// https://leetcode.com/problems/valid-parentheses/

class Solution {
public:
    bool isValid(string s) {
        // create a stack
        stack<char> stk;
        for(char c: s){
            // push to the stack if and only if the braces are of open type
            if(c == '(' || c == '{' || c == '['){
                stk.push(c);
            }
            else{
                // check if stack is empty or not before popping
                if(stk.empty()) return false;
                char temp = stk.top();
                stk.pop();

                // check if the top of stack and the character encountered is of same type
                if(temp == '(' && c == ')') continue;
                if(temp == '[' && c == ']') continue;
                if(temp == '{' && c == '}') continue;

                // if they are of different type then return false as they donot balance
                return false;
            }
        }
        
        // when a banlanced string is given the stack at the end will always be empty
        if(!stk.empty()){
            return false;
        }
        return true;
    }
};