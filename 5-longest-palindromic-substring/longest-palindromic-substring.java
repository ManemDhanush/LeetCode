class Solution {
    public String longestPalindrome(String s) {
        int[] ans = new int[]{0,0};
        for(int i=0;i<s.length(); i++){
            int odd = isPalindrome(i, i, s);
            if (odd > ans[1] - ans[0] + 1) {
                int dist = odd / 2;
                ans[0] = i - dist;
                ans[1] = i + dist;
            }

            int even = isPalindrome(i, i + 1, s);
            if (even > ans[1] - ans[0] + 1) {
                int dist = (even / 2) - 1;
                ans[0] = i - dist;
                ans[1] = i + 1 + dist;
            }
        }

        return s.substring(ans[0], ans[1]+1);
    }

    public int isPalindrome(int i, int j, String s){
        while(i>=0 && j<s.length() && s.charAt(i) == s.charAt(j)){
            i--;
            j++;
        }
        return j - i - 1;
    }
}