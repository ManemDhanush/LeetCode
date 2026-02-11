class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int left = 0;
        int[] s1Hash = new int[26];
        int[] s2Hash = new int[26];
        for(int i = 0; i < s1.length(); i++){
            s1Hash[s1.charAt(i) - 'a']++;
        }

        for(int i=0; i < s2.length(); i++){
            s2Hash[s2.charAt(i) - 'a']++;
            if(i - left + 1 > s1.length()){
                s2Hash[s2.charAt(left) - 'a']--;
                left++;
            }
            boolean isPerm = check(s1Hash, s2Hash);
            if(isPerm) return true;
        }
        return false;
    }

    public boolean check(int[] a1, int[] a2){
        System.out.println(Arrays.toString(a1));
        System.out.println(Arrays.toString(a2));
        for(int i=0; i<26; i++){
            if(a1[i] != a2[i]){
                return false;
            }
        }
        return true;
    }
}