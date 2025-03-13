class Solution {
    public int maxSubArray(int[] nums) {
        int[] maxArray = new int[nums.length];
        int maxValue = nums[0];
        maxArray[0] = nums[0];

        for(int i=1;i <nums.length; i++){
            maxArray[i] = Math.max(maxArray[i-1] + nums[i], nums[i]);
            maxValue = Math.max(maxArray[i], maxValue); 
        } 

        return maxValue;
    }
}