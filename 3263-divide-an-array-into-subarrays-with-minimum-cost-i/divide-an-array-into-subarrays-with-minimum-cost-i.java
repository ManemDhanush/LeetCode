class Solution {
    public int minimumCost(int[] nums) {
        int idx1 = 1, idx2 = 2;
        if (nums[idx1] < nums[idx2]) {
            int temp = idx1;
            idx1 = idx2;
            idx2 = temp;
        }
        for (int i = 3; i < nums.length; i++) {
            if (nums[i] <= nums[idx2]) {
                idx1 = idx2;
                idx2 = i;
            } else if (nums[i] < nums[idx1]) {
                idx1 = i;
            }
        }

        return nums[0] + nums[idx1] + nums[idx2];
    }
}
