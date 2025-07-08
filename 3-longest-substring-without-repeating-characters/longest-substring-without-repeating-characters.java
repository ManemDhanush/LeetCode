class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()<2) return s.length();
        int[] charCount = new int[128];
        int left = 0;
        int right = 0;
        int maxLength = 0;
        // charCount[s.charAt(0) - 'a']++;
        while(left<=right && right < s.length()){
            if(charCount[s.charAt(right)] < 1){
                charCount[s.charAt(right++)]++;
            } else {
                charCount[s.charAt(left++)]--;
            }
            maxLength = Math.max(maxLength, right - left);
        }
        return maxLength;
    }
}