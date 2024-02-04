// https://leetcode.com/problems/valid-anagram/

class Solution {
    public boolean isAnagram(String s, String t) {
        // return if s and t are not equal in length
        if(s.length() != t.length()) return false;

        HashMap<Character, Integer> s1 = new HashMap<Character, Integer>();

        for(int i=0; i<s.length(); i++){
            // increment 1 for every occurance in s string and 
            // decrement 1 for every occurance in t string basically we 0 to all characters if both strings are anagrams
            s1.put(s.charAt(i), s1.getOrDefault(s.charAt(i), 0) + 1);
            s1.put(t.charAt(i), s1.getOrDefault(t.charAt(i), 0) - 1);
        }

        // check if all the occurances are zeroes
        for(char c: s1.keySet()){
            if(s1.get(c) != 0) return false;
        }
        return true;
    }
}