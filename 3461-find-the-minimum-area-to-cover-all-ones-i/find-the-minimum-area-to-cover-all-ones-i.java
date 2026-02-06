class Solution {
    public int minimumArea(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int mini = m, minj = n, maxi = 0, maxj = 0;
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(grid[i][j] == 1){
                    mini = Math.min(mini, i);
                    minj = Math.min(minj, j);
                    maxi = Math.max(maxi, i);
                    maxj = Math.max(maxj, j);
                }
            }
        }
        return (maxi - mini + 1) * (maxj - minj + 1);
    }
}