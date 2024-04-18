// https://leetcode.com/problems/permutations/

class Solution {
public:
    vector<vector<int>> permute(vector<int>& nums) {
        vector<vector<int>> ans;
        vector<int> temp;
        // have a visited bool vector so that we can mark the visited indices
        vector<bool> visited(nums.size(), false);

        dfs(ans, temp, nums, visited);

        return ans;
    }

    void dfs(vector<vector<int>>& ans, vector<int> temp, vector<int> nums, vector<bool> visited){
        // if the temp and nums size are equal then it means that all the elements are visited
        if(temp.size() == nums.size()){
            ans.push_back(temp);
            return;
        }

        // loop through the nums for traversal
        for(int i = 0; i< nums.size(); i++){
            // continue if already visited
            if(visited[i] == true){
                continue;
            }

            // if not mark visited as true and push to temp
            visited[i] = true;
            temp.push_back(nums[i]);

            dfs(ans, temp, nums, visited);
            
            // once the dfs traversal is done then make the visited false and pop that element so that it moves to the next element
            visited[i] = false;
            temp.pop_back();
        }
    }
};