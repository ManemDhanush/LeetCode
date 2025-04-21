class Solution {
    public int numberOfArrays(int[] differences, int lower, int upper) {
        long lMin = 0;
        long uMax = 0;
        long sum = 0;

        for(int d: differences){
            sum += d;
            lMin = Math.min(lMin, sum);
            uMax = Math.max(uMax, sum);
        }
        
        long minX = lower - lMin;
        long maxX = upper - uMax;

        long result = maxX - minX + 1;
        return result < 0 ? 0 : (int)result;
    }
}