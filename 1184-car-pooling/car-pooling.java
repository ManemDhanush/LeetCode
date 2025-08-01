class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
        int[] stops = new int[1001];

        for(int[] trip: trips){
            stops[trip[1]]+=trip[0];
            stops[trip[2]]-=trip[0];
        }

        // System.out.println(Arrays.toString(stops));

        int cap = 0;
        for(int i=0; i<1001; i++){
            cap += stops[i];
            if(cap>capacity) return false;
        }

        return true;
    }
}