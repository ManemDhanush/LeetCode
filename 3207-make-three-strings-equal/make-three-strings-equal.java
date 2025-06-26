class Solution {
    public int findMinimumOperations(String s1, String s2, String s3) {
        int commonLength = 0;
        int minLength = Math.min(s1.length(), Math.min(s2.length(), s3.length()));

        for(int i=0; i<minLength; i++){
            if(s1.charAt(i) == s2.charAt(i) && s1.charAt(i) == s3.charAt(i)){
                commonLength++;
            } else {
                break;
            }
        }

        return commonLength == 0 ? -1 : s1.length() - commonLength + s2.length() - commonLength + s3.length() - commonLength;
    }
}