class Solution {
    // int min = Integer.MAX_VALUE;
    // HashMap<Integer, Integer> memo = new HashMap<>();
    public int coinChange(int[] coins, int amount) {
        // rec(new ArrayList<Integer>(), coins, 0, amount);

        int dp[] = new int[amount + 1];
        Arrays.fill(dp, amount+1);
        dp[0] = 0;

        for(int coin: coins){
            // System.out.println("Coin = " + coin);
            for(int i=coin; i<= amount; i++){
                dp[i] = Math.min(dp[i], 1 + dp[i - coin]);
                // System.out.println("i = " + i);
                // System.out.println(Arrays.toString(dp));
            }
        }

        // System.out.println(Arrays.toString(dp));

        return dp[amount] == amount + 1 ? -1 : dp[amount];
    }
}