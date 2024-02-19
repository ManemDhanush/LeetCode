// https://leetcode.com/problems/container-with-most-water/

class Solution {
public:
    int maxArea(vector<int>& height) {
        int max = 0;
        int left = 0;
        int right = height.size() - 1;

        // logic is compute the choose the minimum of the left height and the right height and compute the distance between left and right 
        // maxCapacity = min(left and right height multiplied by right - left (dist between them))
        while(left < right){
            max = std::max(max, std::min(height[left], height[right]) * (right - left));

            if(height[left] < height[right]){
                left++;
            }
            else{
                right--;
            }
        }

        return max;
        
    }
};