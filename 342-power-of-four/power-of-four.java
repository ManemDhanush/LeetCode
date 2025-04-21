class Solution {
    public boolean isPowerOfFour(int n) {
        if(n == 1) return true;
        while(n>3){
            // System.out.println(n);
            if(n%4 != 0) return false;
            n = n >> 2;
        }
        return n == 1;
    }
}