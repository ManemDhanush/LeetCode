class Solution {
    public int maxAdjacentDistance(int[] nums) {
        int maxDiff = Integer.MIN_VALUE;
        for(int i=1; i<nums.length; i++){
            maxDiff = Math.max(maxDiff, Math.abs(nums[i] - nums[i-1]));
        }
        maxDiff = Math.max(maxDiff, Math.abs(nums[0] - nums[nums.length - 1]));
        return maxDiff;
    }
}