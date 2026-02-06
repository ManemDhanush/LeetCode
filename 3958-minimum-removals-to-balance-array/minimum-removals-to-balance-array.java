class Solution {
    public int minRemoval(int[] nums, int k) {
        Arrays.sort(nums);
        int left = 0;
        int maxLen = 1;

        for (int right = 0; right < nums.length; right++) {
            while (nums[right] > (long) k * nums[left]) {
                left++;
            }
            maxLen = Math.max(maxLen, right - left + 1);
        }

        return nums.length - maxLen;
    }
}
