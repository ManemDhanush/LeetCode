class Solution {
    public int removeDuplicates(int[] nums) {
        int currIndex = 0;
        for(int i=1; i<nums.length; i++){
            if(nums[currIndex] != nums[i]){
                nums[currIndex+1] = nums[i];
                currIndex++;  
            }
        }
        return currIndex+1;
    }
}