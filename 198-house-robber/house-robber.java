class Solution {
    public int rob(int[] nums) {
        // int oddSum = 0;
        // int evenSum = 0;

        // for(int i=0; i<nums.length; i++){
        //     if(i%2==0) evenSum += nums[i];
        //     else oddSum += nums[i];
        // }

        if(nums.length == 1) return nums[0];
        if(nums.length == 2) return Math.max(nums[0], nums[1]);

        int[] dp = new int [nums.length];
        dp[0] = nums[0];
        dp[1] = nums[1];
        dp[2] = nums[0] + nums[2];

        for(int i = 3; i< nums.length; i++){
            dp[i] = Math.max(dp[i-2] + nums[i], dp[i-3] + nums[i]);
        }
        // System.out.println(Arrays.toString(dp));
        return Math.max(dp[dp.length - 1], dp[dp.length - 2]);
    }
}