class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder ans = new StringBuilder();
        int index = 0;
        while(word1.length() > index && word2.length() > index){
            ans.append(word1.charAt(index));
            ans.append(word2.charAt(index));
            index++;
        }
        if(word1.length() <= index){
            ans.append(word2.substring(index,word2.length()));
        } else {
            ans.append(word1.substring(index,word1.length()));
        }
        return ans.toString();
    }
}