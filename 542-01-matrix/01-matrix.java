class Solution {
    public int[][] updateMatrix(int[][] mat) {
        int r = mat.length, c = mat[0].length;
        int[][] dist = new int[r][c];
        // int[][] right = new int[r][c];

        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                if(mat[i][j] == 0){
                    dist[i][j] = 0; 
                } else {
                    int top = (i > 0) ? dist[i - 1][j] : 10000;
                    int left = (j > 0) ? dist[i][j - 1] : 10000;
                    dist[i][j] = Math.min(top, left) + 1;
                }
            }
        }

        for (int i = r - 1; i >= 0; i--) {
            for (int j = c - 1; j >= 0; j--) {
                if (mat[i][j] != 0) {
                    int bottom = (i < r - 1) ? dist[i + 1][j] : 10000;
                    int right = (j < c - 1) ? dist[i][j + 1] : 10000;
                    dist[i][j] = Math.min(dist[i][j], Math.min(bottom, right) + 1);
                }
            }
        }

        return dist;
    }
}