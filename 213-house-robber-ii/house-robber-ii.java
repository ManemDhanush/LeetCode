class Solution {
    public int rob(int[] nums) {
        int robs[] = new int [nums.length + 1];
        int len = nums.length;
        if(len == 1) return nums[0];
        if(len == 2) return Math.max(nums[0], nums[1]);

        int max1 = 0, rot1 = 0;

        for(int i = 0; i< len-1; i++){
            int temp = Math.max(max1, nums[i] + rot1);
            rot1 = max1;
            max1 = temp;
        }

        int max2 = 0, rot2 = 0;

        for(int i = 1; i< len; i++){
            int temp = Math.max(max2, nums[i] + rot2);
            rot2 = max2;
            max2 = temp;
        }

        return Math.max(max1, max2);
    }
}