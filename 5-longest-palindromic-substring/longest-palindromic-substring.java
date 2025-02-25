class Solution {
    public String longestPalindrome(String s) {
        // char[] sChar = s.toCharArray();
        int maxLength = 0;
        String ans = "";
        for(int i=0; i<s.length(); i++){
            String temp1 = palindrome(i,i, s, maxLength);
            String temp2 = palindrome(i,i+1, s, maxLength);
            if(temp1.length() > maxLength){
                ans = temp1;
                maxLength = ans.length();
            }
            if(temp2.length() > maxLength){
                ans = temp2;
                maxLength = ans.length();
            }
        }
        return ans;

    }

    public String palindrome(int start, int end, String s, int maxLength) {
        while(start >= 0 && end < s.length() && s.charAt(start) == s.charAt(end)){
            start--;
            end++;
        }
        if(end - start + 1 > maxLength) {
            return s.substring(start + 1, end);
        }
        return "";
    }
}