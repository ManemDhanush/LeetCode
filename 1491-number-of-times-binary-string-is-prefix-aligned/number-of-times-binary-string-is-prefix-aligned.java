class Solution {
    public int numTimesAllBlue(int[] flips) {

        int count = 0;
        int currMax = 1;

        for(int i=0; i<flips.length; i++){
            currMax = Math.max(currMax, flips[i]);
            if(currMax <= i + 1){
                count++;
            }
        }

        return count;
        
    }
}