// https://leetcode.com/problems/daily-temperatures/

class Solution {
public:
    vector<int> dailyTemperatures(vector<int>& temperatures) {
        vector<int> ans;
        // having a stack with the temperature with the index so that we can manipulate the index later
        stack<pair<int, int>> stk;

        for(int i = 0; i < temperatures.size(); i++){
            // check if the top of the stacks temp is less than the current temp
            // if yes then loop through till the stack is empty or till the top is greater than current temp
            while (!stk.empty() && stk.top().first < temperatures[i]){
                int idx = stk.top().second;
                // update the ans with the difference between indeices
                ans[idx] = i - idx;
                stk.pop();
            }
            // push the current temp and its index
            stk.push(make_pair(temperatures[i], i));
            // push 0 to stack as default, it can be modified later in the loop
            ans.push_back(0);
        }
        return ans;
    }
};