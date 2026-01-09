class Solution {
    public int secondsToRemoveOccurrences(String s) {
        int len = s.length();
        int numOfOnes = 0;
        int numOfZero = 0;
        int firstZeroIndex = 0;
        boolean changeZeroIndex = true;
        int conZero = 0;
        int ans = 0;
        for(int i=0; i<len; i++){
            if(s.charAt(i) == '0'){
                numOfZero++;
                 if(changeZeroIndex){
                    changeZeroIndex = false;
                    firstZeroIndex = i;
                } else if(i - firstZeroIndex - conZero < 2){
                    conZero++;
                }
            } else {
                numOfOnes++;
                if(numOfZero > 0){
                    ans = Math.max(ans+1, numOfZero);
                }
            }
        }
        if(numOfOnes + conZero == len) return 0;
        return ans;
    }
}