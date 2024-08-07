class Solution {
    public boolean isSubsequence(String s, String t) {
        int index = 0;
        for(int i=0; i<s.length(); i++){
            while(index < t.length() && t.charAt(index)!=s.charAt(i)){
                index++;
            }
            if(index == t.length()){
                return false;
            }
            index++;
        }
        return true;
    }
}