class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> hash = new HashMap<>();
        for(String s: strs){
            char[] charArray = s.toCharArray();
            Arrays.sort(charArray);
            String str = new String(charArray); 
            List<String> l = hash.getOrDefault(str, new ArrayList<>());
            l.add(s);
            hash.put(str, l);
        }
        List<List<String>> ans = new ArrayList<>();

        for(String s: hash.keySet()){
            ans.add(hash.get(s));
        }
        return ans;
    }
}