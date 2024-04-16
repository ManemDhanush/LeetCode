// https://leetcode.com/problems/combination-sum

class Solution {
public:
    vector<vector<int>> combinationSum(vector<int>& candidates, int target) {

        vector<vector<int>> ans;
        vector<int> temp;

        // used dfs to solve this problem, passing the ans, target sum, the height of the tree, temp to store the current node and nums for gettign the data.
        dfs(ans, target, 0, temp, candidates);

        return ans;
    }

    void dfs(vector<vector<int>>& ans, int target, int height, vector<int> temp, vector<int> candidates){

        // append to the list if the sum of the temp is equal to target
        if(accumulate(temp.begin(), temp.end(), 0) == target){
            ans.push_back(temp);
            return;
        }

        // return if the height is greater then the candidate size or sum is greater than target
        if(accumulate(temp.begin(), temp.end(), 0) > target || height >= candidates.size()){
            return;
        }

        // adding the current height element to the temp 
        temp.push_back(candidates[height]);
        // dfs with the same height so as to remove duplications 
        dfs(ans, target, height, temp, candidates);
        // remove the last element if not it will always have the first element 
        temp.pop_back();
        // dfs the height + 1 to get all the combinations
        dfs(ans, target, height+1, temp, candidates);
    }
};

