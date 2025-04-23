class Solution {
    public int numberOfSubstrings(String s, int k) {
        int ans = 0;
        for(int i=0; i<s.length(); i++){
            int []numChars = new int[26];
            for(int j=i; j<s.length(); j++){
                numChars[s.charAt(j) - 'a']++;
                if(numChars[s.charAt(j) - 'a'] >= k){
                    ans+=s.length() - j;
                    break;
                }
            }
        }
        return ans;
    }
}