class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] ans = new int[nums.length];

        int leftIdx = 0;
        int rightIdx = nums.length - 1;
        int currIdx = nums.length - 1;

        while(leftIdx <= rightIdx) {
            if(Math.abs(nums[leftIdx]) < Math.abs(nums[rightIdx])){
                ans[currIdx--] = nums[rightIdx] * nums[rightIdx];
                rightIdx--; 
            } else {
                ans[currIdx--] = nums[leftIdx] * nums[leftIdx];
                leftIdx++;
            }
        }

        return ans;
    }
}