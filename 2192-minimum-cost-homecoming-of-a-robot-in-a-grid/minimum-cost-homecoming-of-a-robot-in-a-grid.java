class Solution {
    public int minCost(int[] startPos, int[] homePos, int[] rowCosts, int[] colCosts) {
        int sr = startPos[0];
        int sc = startPos[1];
        int er = homePos[0];
        int ec = homePos[1];
        int cost = 0;

        if(sr < er){
            for(int i=sr+1; i<=er; i++){
                cost+=rowCosts[i];
            }
        } else {
            for(int i=sr-1; i>=er; i--){
                cost+=rowCosts[i];
            }
        }
        if(sc < ec){
            for(int i=sc+1; i<=ec; i++){
                cost+=colCosts[i];
            }
        } else {
            for(int i=sc-1; i>=ec; i--){
                cost+=colCosts[i];
            }
        }
        return cost;
    }
}