// https://leetcode.com/problems/check-if-all-characters-have-equal-number-of-occurrences/
class Solution {
    public boolean areOccurrencesEqual(String s) {

        // create a hash map that stores the value and index of nums
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        
        // store value and index
        for(char c: s.toCharArray()){
            // check if the hashmap contains key, if not add 1 
            map.put(c, map.containsKey(c) ? (map.get(c) + 1) : 1);
        }

        // get the count of the first character
        int count = map.get(s.charAt(0));

        // check if all the occurances are equal
        for(char c: map.keySet()){
            // if not return false
            if(map.get(c) != count) return false;
        }
        return true;
    }
}