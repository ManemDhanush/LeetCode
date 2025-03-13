class Solution {
    public boolean canJump(int[] nums) {
        int maxIndex = nums[0];

        for(int i=0; i<nums.length; i++){
            if(maxIndex < i) return false;
            if(nums[i] + i > maxIndex){
                maxIndex = nums[i] + i;
            }
        }

        return true;
    }
}