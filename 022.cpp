// https://leetcode.com/problems/generate-parentheses/

class Solution {
public:
    vector<string> generateParenthesis(int n) {
        vector<string> ans;
        string s = "";

        // using backtracking and call by reference
        backtrack(0, 0, s, ans, n);
        return ans;
    }

    // the backtrack method takes the number of opening brackets, closing brackets, the matched string
    // the ans vector which is called by reference and the total number of allowed brackets required
    void backtrack(int open, int close, string s,vector<string> &ans, int n) {
        // base condition when open brackets == close brackets == total brackets
        if (open == close && close == n) {
            ans.push_back(s);
            return;
        }

        // append a open bracket if it is less than n
        if (open < n) {
            s += "(";
            // call recursive 
            backtrack(open + 1, close, s, ans, n);
            // removing a open bracket when failed so as to not duplicate 
            s = s.substr(0, s.length()-1);
        }

        // append a close bracket if it is less than open bracket
        if (close < open) {
            s += ")";
            // call recursive 
            backtrack(open, close + 1, s, ans, n);
        }
    }

};