class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        for(String s: strs){
            char[] c = s.toCharArray();
            Arrays.sort(c);
            String ss = new String(c);
            List<String> a = map.getOrDefault(ss, new ArrayList<>());
            a.add(s);
            map.put(ss,a);
        }
        List<List<String>> ans = new ArrayList<>();
        for(List<String> l: map.values()){
            ans.add(l);
        }
        return ans;
    }
}