// https://leetcode.com/problems/subsets-ii/

class Solution {
public:
    vector<vector<int>> subsetsWithDup(vector<int>& nums) {
        vector<vector<int>> ans;
        vector<int> temp;
        
        dfs(ans, temp,nums, 0);

        return ans;
    }

    void dfs(vector<vector<int>>& ans, vector<int> temp, vector<int>& nums, int height){
        if(height == nums.size()){
            // sorting the temp so that checking if it exists in the ans or not would be easy
            sort(temp.begin(), temp.end());
            if(find(ans.begin(), ans.end(),temp)==ans.end()){
                ans.push_back(temp);
            }
            return;
        }

        // not selecting the number and then moving the height
        dfs(ans, temp, nums, height+1);
        // adding the nums[heigth] and then moving the height 
        temp.push_back(nums[height]);
        dfs(ans, temp, nums, height+1);

    }
};