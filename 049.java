// https://leetcode.com/problems/group-anagrams/

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans = new ArrayList<List<String>>();
        // a hashmap that stores the hash of the string and the list which have the same hashes
        HashMap<String,List<String>> map = new HashMap<String,List<String>>();
        for(int i=0; i<strs.length; i++){
            String hash = "";
            // for creating a hash
            int[] charArray = new int[26];
            for(int j=0; j<strs[i].length(); j++){
                int ascii = (int) strs[i].charAt(j) - 97;
                charArray[ascii] = charArray[ascii] == 0 ? 1 : charArray[ascii] + 1;   
            }

            // the hash is of format 0/1/2/1/2/.../5
            // the above means 0 a's 1 b's 2 c's ... 5 z's
            for(int j=0; j<26; j++){
                hash += charArray[j]+"/"; 
            }
            
            // chech if hash is present in the hashmap
            if(!map.containsKey(hash)){
                map.put(hash, new ArrayList());
            } 
            map.get(hash).add(strs[i]);
        }

        // making the final output as requested
        for(List<String> a: map.values()){
            ans.add(a);
        }

        return ans;
    }
}