class Solution {
    public int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int dp[][] = new int[m][n];

        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(i == 0 && j == 0) {
                    dp[i][j] = grid[i][j];
                } else {
                    int minUp = i > 0 ? dp[i - 1][j] : Integer.MAX_VALUE;
                    int minLt = j > 0 ? dp[i][j - 1] : Integer.MAX_VALUE;
                    dp[i][j] = Math.min(minUp, minLt) + grid[i][j];
                }
            }
        }

        // for(int[] x: dp){
        //     System.out.println(Arrays.toString(x));
        // }

        return dp[m-1][n-1];
    }
}