class Solution {
    public int[][] construct2DArray(int[] original, int m, int n) {
        if(m*n != original.length) return new int[0][0];
        int [][] result = new int[m][n];
        int m1 = 0;
        int n1 = 0;
        int len = 0;

        while(true){
            if(n1 == n){
                n1 = 0;
                m1++;
            }
            if(m1 == m){
                break;
            }
            result[m1][n1++] = original[len++];
        }

        return result;
    }
}