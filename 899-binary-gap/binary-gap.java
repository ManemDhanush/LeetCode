class Solution {
    public int binaryGap(int n) {
        int[] bitMap = new int[32];
        int index = 0;
        for(int i=0; i<32; i++){
            if(((n >> i) & 1) == 1){
                bitMap[index] = i;
                index++;
            }
        }

        int ans = 0;
        for (int i = 0; i < index - 1; ++i)
            ans = Math.max(ans, bitMap[i+1] - bitMap[i]);
        return ans;
    }
}