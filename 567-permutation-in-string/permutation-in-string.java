class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length() > s2.length()) return false;
        int[] s1Hash = new int[26];
        int[] s2Hash = new int[26];
        for(int i = 0; i < s1.length(); i++){
            s1Hash[s1.charAt(i) - 'a']++;
            s2Hash[s2.charAt(i) - 'a']++;
        }

        for(int i=0; i < s2.length() - s1.length(); i++){
            if(check(s1Hash, s2Hash)) return true;
            s2Hash[s2.charAt(i + s1.length()) - 'a']++;
            s2Hash[s2.charAt(i) - 'a']--;
        }
        return check(s1Hash, s2Hash);
    }

    public boolean check(int[] a1, int[] a2){
        for(int i=0; i<26; i++){
            if(a1[i] != a2[i]){
                return false;
            }
        }
        return true;
    }
}