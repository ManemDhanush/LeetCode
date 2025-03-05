class Solution {
    public int missingNumber(int[] nums) {
        int miss = 0;
        for(int i = 0; i<nums.length; i++){
            miss = miss ^ (i+1) ^ nums[i];
        }
        return miss;
    }
}