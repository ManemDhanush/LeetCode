class Solution {
    public boolean canBeIncreasing(int[] nums) {
        int dip = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i-1] >= nums[i]) {
                if (dip == 1) return false;
                dip++;
                
                if (i == 1 || nums[i] > nums[i-2]) {
                    continue; // Remove nums[i-1]
                } else if (i == nums.length - 1 || nums[i+1] > nums[i-1]) {
                    continue; // Remove nums[i]
                } else {
                    return false; // Can't make it increasing by removing either nums[i-1] or nums[i]
                }
            }
        }
        return true;
    }
}