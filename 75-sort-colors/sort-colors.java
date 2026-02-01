class Solution {
    public void sortColors(int[] nums) {
        int idx1 = 0;
        int idx2 = 0;
        int idx3 = nums.length-1;

        while(idx2 <= idx3){
            if(nums[idx2] == 0){
                int t = nums[idx1];
                nums[idx1] = nums[idx2];
                nums[idx2] = t;
                idx1++;
                idx2++;
            } else if(nums[idx2] == 2){
                int t = nums[idx3];
                nums[idx3] = nums[idx2];
                nums[idx2] = t;
                idx3--;
            } else {
                idx2++;
            }
        }
    }
}