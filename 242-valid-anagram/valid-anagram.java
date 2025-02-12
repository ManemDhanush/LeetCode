class Solution {
    public boolean isAnagram(String s, String t) {
        char[] charArr = new char[26];
        for(char c: s.toCharArray()){
            // System.out.println((int)c);
            charArr[(int)c - 97] += 1;
        }
        for(char c: t.toCharArray()){
            charArr[(int)c - 97] -= 1;
        }
        for(int i = 0; i< 26; i++){
            if(charArr[i] != 0) return false;
        }
        return true;
    }
}