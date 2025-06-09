class Solution {
    boolean canWalk = false;

    public boolean findSafeWalk(List<List<Integer>> grid, int health) {
        int[][] maxHealth = new int[grid.size()][grid.get(0).size()];
        int[][] dir = {{-1,0},{1,0},{0,-1},{0,1}};
        int row = grid.size(), col = grid.get(0).size();
        Deque<int[]> deque = new ArrayDeque<>();
        if(grid.get(0).get(0) == 1) health--;
        deque.addFirst(new int[]{0,0,health});

        while(!deque.isEmpty()){
            int[] q = deque.pollFirst();
            int i = q[0], j=q[1], h=q[2];

            if(i==row -1 && j==col-1) return true;

            for(int[] d: dir){
                int ni = i + d[0];
                int nj = j + d[1];

                if(ni>=0 && nj>=0 && ni<row && nj<col){
                    int nh = h - grid.get(ni).get(nj);
                    if(nh >= 0 && nh > maxHealth[ni][nj]){
                        maxHealth[ni][nj] = nh;
                        if(grid.get(ni).get(nj)==0){
                            deque.addFirst(new int[]{ni, nj, nh});
                        } else {
                            deque.addLast(new int[]{ni, nj, nh});
                        }
                    }
                }
            }

        }
        // dfs(0, 0, health, grid, visited);
        return false;
    }

    public void dfs(int i, int j, int health, List<List<Integer>> grid, boolean[][] visited) {
        if (i < 0 || i >= grid.size() || j < 0 || j >= grid.get(0).size() || health < 0 || visited[i][j]) {
            return;
        }

        if (grid.get(i).get(j) == 1) {
            health--;
        }

        if (i == grid.size() - 1 && j == grid.get(0).size() - 1) {
            if (health >= 0)
                canWalk = true;
            return;
        }

        visited[i][j] = true;

        dfs(i - 1, j, health, grid, visited);
        dfs(i + 1, j, health, grid, visited);
        dfs(i, j - 1, health, grid, visited);
        dfs(i, j + 1, health, grid, visited);

        visited[i][j] = false; // backtrack
    }
}
