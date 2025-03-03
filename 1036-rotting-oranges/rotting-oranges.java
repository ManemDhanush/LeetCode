class Solution {
    public int orangesRotting(int[][] grid) {
        int[][] freshness = new int[grid.length][grid[0].length];
        for(int[] arr: freshness){
            Arrays.fill(arr, Integer.MAX_VALUE);
        }

        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[0].length; j++) {
                if(grid[i][j] == 2)
                dfs(grid, freshness, i,j,0);
            }
        }

        // for(int[] x: freshness){
        //     System.out.println(Arrays.toString(x));
        // }

        int max = 0;

        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[0].length; j++) {
                if (grid[i][j] == 1 && freshness[i][j] == Integer.MAX_VALUE) {
                    return -1;
                }
                if(freshness[i][j] != Integer.MAX_VALUE)
                max = Math.max(max, freshness[i][j]);
            }
        }

        return max;
    }

    public void dfs(int[][] grid, int[][] freshness, int i, int j, int fresh){
        if(i<0 || j< 0 || i > grid.length -1 || j > grid[0].length - 1 || grid[i][j] == 0 ) return;
        if (fresh >= freshness[i][j]) return;
        
        freshness[i][j] = Math.min(freshness[i][j], fresh);
        dfs(grid, freshness, i+1, j, fresh + 1);
        dfs(grid, freshness, i, j+1, fresh + 1);
        dfs(grid, freshness, i-1, j, fresh + 1);
        dfs(grid, freshness, i, j-1, fresh + 1);
    }
}