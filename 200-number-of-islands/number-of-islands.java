class Solution {
    int count = 0;
    public int numIslands(char[][] grid) {
        boolean[][] visited = new boolean[grid.length][grid[0].length];
        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[i].length; j++){
                if(!visited[i][j] && grid[i][j] == '1'){
                    dfs(grid, visited, i,j);
                    count++;
                }
            }
        }
        // for(boolean[] x: visited){
        //     System.out.println(Arrays.toString(x));
        // }
        return count ; 
    }
    public void dfs(char[][] grid, boolean[][] visited, int i, int j) {

        if(i>grid.length - 1 || j>grid[0].length -1 || i<0 || j<0 || visited[i][j] || grid[i][j] == '0'){
            return;
        }
        visited[i][j] = true;
        dfs(grid, visited, i,j+1);
        dfs(grid, visited, i+1,j);
        dfs(grid, visited, i-1, j);
        dfs(grid, visited, i, j-1);

    }
}