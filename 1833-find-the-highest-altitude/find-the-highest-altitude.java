class Solution {
    public int largestAltitude(int[] gain) {
        int maxAltitude = 0;
        int altitude = 0;

        for(int g: gain){
            altitude+= g;
            maxAltitude = Math.max(maxAltitude, altitude);
        }
        return maxAltitude;
    }
}