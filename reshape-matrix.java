// https://leetcode.com/problems/reshape-the-matrix/

class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int m = mat.length;
        int n = mat[0].length;
        
        // Initial condition where the matricies donot match
        if(c*r != m*n) return mat;

        int x = 0;
        int y = 0;
        int[][] resultMat = new int[r][c];

        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                // check if the result matrix row size is being overflown or not
                if(y == c){
                    x++;
                    y=0;
                }
                resultMat[x][y++] = mat[i][j];
            }
        }
        return resultMat;
    }
}