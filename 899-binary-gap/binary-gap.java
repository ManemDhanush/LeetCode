class Solution {
    public int binaryGap(int n) {
        int maxLen = 0;
        int currIndex = 0;
        String binaryString = Integer.toBinaryString(n);
        for(int i=0; i<binaryString.length(); i++){
            if(binaryString.charAt(i) == '0') continue;
            maxLen = Math.max(maxLen, i - currIndex);
            currIndex = i;
        }
        return maxLen;
    }
}