class Solution {
    public boolean isVowel(char c){
        switch(c){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u': return true;
            default: return false;
        }
    }
    public int maxVowels(String s, int k) {
        int maxCount = 0;
        int count = 0;

        for(int i=0; i<k; i++){
            if(isVowel(s.charAt(i))) maxCount++;
        }
        count = maxCount;
        for(int i=k; i<s.length(); i++){
            if(isVowel(s.charAt(i))) count++;
            if(isVowel(s.charAt(i - k))) count--;

            maxCount = Math.max(maxCount, count);
        }

        return maxCount;
    }
}