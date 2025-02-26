class Solution {
    public boolean canJump(int[] nums) {
        int maxIndex = nums[0];
        int n = nums.length;
        for(int i=0; i<n; i++) {
            // System.out.println("maxIndex = " +maxIndex);
            if(maxIndex >= n-1) return true;
            if(i <= maxIndex) {
                maxIndex = Math.max(maxIndex, nums[i] + i);
            }
        }
        return false;
    }
}