class Solution {
    public int longestSubarray(int[] nums) {
        int prevLength = 0;
        int currentLength = 0;
        int maxCount = 0;
        
        for(int n: nums){
            if(n == 1){
                currentLength++;
            } else {
                maxCount = Math.max(maxCount, currentLength + prevLength);
                prevLength = currentLength;
                currentLength = 0;
            }
        }

        maxCount = Math.max(maxCount, currentLength + prevLength);

        return maxCount == nums.length ? maxCount - 1 : maxCount;

    }
}