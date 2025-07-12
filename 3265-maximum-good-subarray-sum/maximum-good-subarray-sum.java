class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        Map<Integer, Long> seen = new HashMap<>();
        long maxSum = Long.MIN_VALUE;
        long currSum = 0;
        int left = 0;

        for (int right = 0; right < nums.length; right++) {
            currSum += nums[right];

            if (seen.containsKey(nums[right] - k)) {
                maxSum = Math.max(maxSum, currSum - seen.get(nums[right] - k));
            }
            if (seen.containsKey(nums[right] + k)) {
                maxSum = Math.max(maxSum, currSum - seen.get(nums[right] + k));
            }

            if (!seen.containsKey(nums[right])) {
                seen.put(nums[right], currSum - nums[right]);
            } else {
                seen.put(nums[right], Math.min(seen.get(nums[right]), currSum - nums[right]));
            }
        }

        return maxSum == Long.MIN_VALUE ? 0 : maxSum;
    }
}
