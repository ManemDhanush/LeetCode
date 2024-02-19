// https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/

class Solution {
public:
    vector<int> twoSum(vector<int>& numbers, int target) { 

        // iterate through the number vector
        for(int i = 0, j = numbers.size() - 1 ; i < j; ){

            // check for sum fi equal then return
            if(numbers[i] + numbers[j] == target){
                return {i+1, j+1};
            }

            // check if the sum is less than the target increment the left pointer
            if(numbers[i] + numbers[j] < target){
                i++;
            }

            // else decrement the right pointer
            else {
                j--;
            }
        }

        return {-1, -1};
    }
};