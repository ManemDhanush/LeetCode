class Solution {
    int max = 0;
    public int getMaximumGold(int[][] grid) {
        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[0].length; j++){
                if(grid[i][j] != 0){
                    boolean[][] visited = new boolean[grid.length][grid[0].length];
                    dfs(grid, visited, i, j, 0);
                }
            }
        }

        return max;
    }

    public void dfs(int[][] grid, boolean[][] visited, int i, int j, int sum) {
        if(i<0 || j<0 || i>grid.length-1 || j>grid[0].length-1 || visited[i][j] || grid[i][j] == 0) return;

        max = Math.max(max, sum + grid[i][j]);
        visited[i][j] = true;

        dfs(grid, visited, i+1,j,sum + grid[i][j]);
        dfs(grid, visited, i-1,j,sum + grid[i][j]);
        dfs(grid, visited, i,j+1,sum + grid[i][j]);
        dfs(grid, visited, i,j-1,sum + grid[i][j]);

        visited[i][j] = false;

    }
}