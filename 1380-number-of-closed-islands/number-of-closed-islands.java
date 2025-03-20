class Solution {
    public int closedIsland(int[][] grid) {
        int count = 0;
        int visited[][] = new int [grid.length][grid[0].length];

        for(int i=0; i< grid.length; i++){
            for(int j=0; j<grid[0].length; j++){
                if(visited[i][j] == 0 && grid[i][j] == 0) {
                    if(dfs(visited, grid, i, j) == 1)
                    count++;
                }
            }
        }

        return count;
    }

    public int dfs(int[][] visited, int[][] grid, int i, int j) {
        if(i<0 || j<0 || i> grid.length-1 || j>grid[0].length-1) return 0;
        if(visited[i][j] != 0) return visited[i][j];
        if (grid[i][j] == 1) return 1;

        visited[i][j] = -1;

        visited[i][j] = dfs(visited, grid, i+1, j) & dfs(visited, grid, i-1, j)  & dfs(visited, grid, i, j+1)  & dfs(visited, grid, i, j-1);
        return visited[i][j];
    }
}