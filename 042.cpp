// Problem Link: https://leetcode.com/problems/trapping-rain-water/
// Approach: Two-pointer approach to trap rainwater between heights
class Solution {
public:
    int trap(vector<int>& height) {

        // If there are less than 3 elements, no water can be trapped
        if(height.size() < 3){
            return 0;
        }

        // Vectors to store maximum heights seen from the left and right directions at each index
        vector<int> maxLeft;
        vector<int> maxRight;
        int storage = 0;
        auto max = max_element(height.begin(), height.end());
        
        // Initialize the first block with initial conditions
        maxLeft.push_back(0);
        maxRight.push_back(*max);

        // Compute maxLeft and maxRight vectors to hold the maximum heights seen from the left and right directions
        for(int i = 1; i < height.size() - 1; i++){
            // Store the maximum height seen to the left of the current index
            maxLeft.push_back(std::max(maxLeft.back(), height[i - 1]));

            // Inefficiently, compute the maximum height seen to the right of the current index
            maxRight.push_back(*max_element(height.begin() + i + 1, height.end()));
        }

        // Add the last block with initial conditions
        maxLeft.push_back(*max);
        maxRight.push_back(0);

        // Iterate over the blocks to determine the amount of water that can be trapped
        for(int i = 0; i < maxLeft.size(); i++){
            // If the height at index i is less than both maxLeft and maxRight heights, water can be trapped
            if(maxLeft[i] > height[i] && maxRight[i] > height[i]){
                // Subtract the current height to get the amount of water that can be held by the block
                storage += (int)std::min(maxLeft[i], maxRight[i]) - height[i];
            }
        }

        // Return the total amount of water trapped
        return storage;
    }
};
