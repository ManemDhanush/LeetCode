class Solution {
    public int rob(int[] nums) {
        if(nums.length < 3) {
            if(nums.length < 2) return nums[0];
            return Math.max(nums[0], nums[1]);
        }
        int robs[] = new int[nums.length];
        robs[0] = nums[0];
        robs[1] = nums[1];
        robs[2] = nums[2] + robs[0];
        for(int i=3; i<nums.length; i++){
            robs[i] = nums[i] + Math.max(robs[i-2], robs[i-3]);
        }
        // System.out.println(Arrays.toString(robs));
        return Math.max(robs[nums.length -1], robs[nums.length - 2]);
    }
}