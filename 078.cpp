// https://leetcode.com/problems/subsets/

class Solution {
public:
    vector<vector<int>> subsets(vector<int>& nums) {
        vector<vector<int>> ans;
        vector<int> temp;

        // used dfs to solve this problem, passing the ans, size of the nums, the height of the tree, nums for gettign the data and temp to store the current node.
        dfs(ans, nums.size(), 0, nums, temp);

        return ans;
        

    }

    void dfs(vector<vector<int>>& ans, int size, int height, vector<int>& nums, vector<int> temp){
        // if the max height is reached then add the temp to ans
        if(height >= size){
            ans.push_back(temp);
            return;
        }

        // this is to not add the nums[height] element and then traverse
        dfs(ans, size, height +1, nums, temp);
        
        // add the nums[height] and then traverse
        temp.push_back(nums[height]);
        dfs(ans, size, height +1, nums, temp);
    }
};