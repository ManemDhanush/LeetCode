public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        // System.out.println(n);
        int ans = 0;
        for(int i=0;i<32;i++){
            int offset = n&1;
            ans=ans<<1;
            ans = ans | offset;
            n=n>>1;            
        }
        return ans;
    }
}