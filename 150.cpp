// https://leetcode.com/problems/evaluate-reverse-polish-notation/

class Solution {
public:
    int evalRPN(vector<string>& tokens) {
        // stack to store only numbers
        stack<string> nums;
        for(auto x: tokens){
            // check if the string is operation or not, if not then push to nums
            // assuming the input is always correct
            if(x == "+" || x == "/" || x == "*" || x == "-"){
                if(x == "+"){
                    int num1 = stoi(nums.top());
                    nums.pop();
                    int num2 = stoi(nums.top());
                    nums.pop();
                    // add the numbers and then push to stack
                    nums.push(to_string(num2 + num1));
                } 
                else if(x == "-"){
                    int num1 = stoi(nums.top());
                    nums.pop();
                    int num2 = stoi(nums.top());
                    nums.pop();
                    // subtract the numbers and then push to stack
                    nums.push(to_string(num2 - num1));
                } 
                else if(x == "*"){
                    int num1 = stoi(nums.top());
                    nums.pop();
                    int num2 = stoi(nums.top());
                    nums.pop();
                    // multiply the numbers and then push to stack
                    nums.push(to_string(num2 * num1));
                } 
                else if(x == "/"){
                    int num1 = stoi(nums.top());
                    nums.pop();
                    int num2 = stoi(nums.top());
                    nums.pop();
                    // divide the numbers and then push to stack
                    nums.push(to_string(num2 / num1));
                }
            }
            else{
                nums.push(x);
            }
        }

        // retutn the top of the stack
        return stoi(nums.top());
    }
};