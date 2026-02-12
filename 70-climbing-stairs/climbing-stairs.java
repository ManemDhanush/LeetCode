class Solution {
    int count = 0;
    public int climbStairs(int n) {
        int memo[] = new int[n + 1];
        return choose(0, n, memo);
    }

    public int choose(int currSum, int n, int[] memo){
        if(currSum == n){
            return 1;
        } else if(currSum > n) {
            return 0;
        }
        if (memo[currSum] > 0) {
            return memo[currSum];
        }
        memo[currSum] = choose(currSum + 1, n, memo) + choose(currSum + 2, n, memo);
        return memo[currSum];
    }
}