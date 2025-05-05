class Solution {
    public int numTilings(int n) {
        int mod = 1_000_000_007;
        int []tab = new int [n+1];
        return dp(n, tab, mod);
    }
    

    int dp(int n, int[] tab, int mod) {
        if(n==1){
            tab[n] = 1;
            return 1;
        }
        if(n==2){
            tab[n] = 2;
            return 2;
        }
        if(n==3){
            tab[n] = 5;
            return 5;
        }
        if(tab[n] != 0) return tab[n];
        tab[n] = (int)(((2 * (long)dp(n-1, tab, mod) % mod + (long)dp(n-3, tab, mod) % mod) % mod));
        return tab[n];
    }
}