class Solution {
    public int missingNumber(int[] nums) {
        for(int i=1; i<nums.length; i++){
            nums[i] = nums[i-1]+nums[i];
        }
        return( nums.length * (nums.length + 1) / 2 ) - nums[nums.length - 1];
    }
}