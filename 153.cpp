// https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/

class Solution {
public:
    int findMin(vector<int>& nums) {
        int start = 0;
        int end = nums.size() - 1;
        int ans = nums[0];

        while(start <= end){
            // If the array is sorted, the minimum element is nums[start]
            if(nums[start] < nums[end]){
                ans = min(ans, nums[start]);
                break;
            }
            int mid = start + (end - start) / 2;
            // check min of mid and ans
            ans = min(ans,nums[mid]);
            // update start if mid > start
            if(nums[start] <= nums[mid]){
                start = mid + 1;
            }
            // update end if mid < end
            else {
                end = mid - 1;
            }
        }
        return ans;
    }
};