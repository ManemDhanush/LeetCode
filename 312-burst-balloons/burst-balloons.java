class Solution {
    public int maxCoins(int[] nums) {
        int n = nums.length;

        int baloons[] = new int[n+2];
        baloons[0] = 1;
        baloons[n+1] = 1;

        for(int i=0; i<n; i++){
            baloons[i+1] = nums[i];
        }

        int[][] dp = new int[n+2][n+2];

        for(int len = 1; len <= n; len++) {
            for(int left = 1; left <= n - len + 1; left++){
                int right = left + len - 1;
                for(int i=left; i<= right; i++){
                    int coins = baloons[left - 1] * baloons[i]  * baloons[right + 1];
                    coins += dp[left][i-1] + dp[i+1][right];

                    dp[left][right] = Math.max(dp[left][right], coins);
                }
            }
            // for(int[] x: dp){
            //     System.out.println(Arrays.toString(x));
            // }
            // System.out.println();
        }

        // for(int[] x: dp){
        //     System.out.println(Arrays.toString(x));
        // }

        return dp[1][n];
    }
}