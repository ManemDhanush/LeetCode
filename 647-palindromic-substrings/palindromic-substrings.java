class Solution {
    public int countSubstrings(String s) {
        int len = s.length();
        boolean[][] dp = new boolean[len][len];

        for(int i=0; i<len; i++){
            dp[i][i] = true;
        }
        // for(int i=0; i<len-1; i++){
        //     if(s.charAt(i) == s.charAt(i+1))
        //     dp[i+1][i] = true;
        // }
        int i=0, j=0, x=0, ans=0;

        while(x != len){
            // System.out.println("i = " + i + " j = "+j);
            if(j==len){
                x++;
                i = 0;
                j = x;
                continue;
            }

            if (s.charAt(i) == s.charAt(j) && (j - i <= 1 || dp[i + 1][j - 1])) {
                dp[i][j] = true;
                ans++;
            }
            i++;
            j++;
        }

        // for(int i=0; i<len; i++)
        // System.out.println(Arrays.deepToString(dp));
        // int ans = 0;
        // for(int i = 0)
        // for(boolean[] d: dp){
        //     System.out.println(Arrays.toString(d));
        // }

        return ans;
    }
}