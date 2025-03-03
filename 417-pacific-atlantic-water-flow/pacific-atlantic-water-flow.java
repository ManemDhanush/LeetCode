class Solution {
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        // boolean []][] visited = new int [heights.length][heights[0].length];
        boolean [][] pacific = new boolean [heights.length][heights[0].length];
        boolean [][] atlantic = new boolean [heights.length][heights[0].length];
        List<List<Integer>> ans = new ArrayList<>();
        
        for (int i = 0; i < heights.length; i++) {
            visit(heights, pacific, heights[i][0], i, 0);
            visit(heights, atlantic, heights[i][heights[0].length - 1], i, heights[0].length - 1);
        }

        for (int j = 0; j < heights[0].length; j++) {
            visit(heights, pacific, heights[0][j], 0, j);
            visit(heights, atlantic, heights[heights.length - 1][j], heights.length - 1, j);
        }

        // for(boolean[] d: pacific){
        //     System.out.println(Arrays.toString(d));
        // }


        // for(int i=0; i<heights.length; i++) {
        //     for(int j=0; j<heights[0].length; j++){
        //         dfs(heigths, reach, i,j);
        //     }
        // }

        for(int i=0; i<heights.length; i++) {
            for(int j=0; j<heights[0].length; j++){
                if(pacific[i][j] && atlantic[i][j]) {
                    ArrayList<Integer> l = new ArrayList<Integer>();
                    l.add(i);
                    l.add(j);
                    ans.add(l);
                }
            }
        }
        return ans;
    }

    void visit(int[][] heights, boolean[][] ocean, int val, int i, int j) {
        if(i<0 || j<0 || i > heights.length - 1 || j > heights[0].length - 1) return;
        if(ocean[i][j]) return;
        if(heights[i][j] < val) return;
        
        ocean[i][j] = true;

        visit(heights, ocean, heights[i][j], i+1, j);
        visit(heights, ocean, heights[i][j], i, j+1);
        visit(heights, ocean, heights[i][j], i-1, j);
        visit(heights, ocean, heights[i][j], i, j-1);

    }

    // void dfs(int[][] heigths, int[]][] reach, int i, int j) {
    //     // 1 means pacific
    //     if(i<0) reach[i][j] += 1;
    //     // 2 means atlantic
    //     if(j>heigths[0].length) reach[i][j] += 2;

    //     if(i<0 || j<0 || i > heigths.length || j > heights[0].length) return;
    //     if(heigths[i][j] < reach[i][j]) return;

    //     dfs(heigths, reach, i+1,j);
    //     dfs(heigths, reach, i,j+1);
    //     dfs(heigths, reach, i-1,j);
    //     dfs(heigths, reach, i,j-1);
    // }
}