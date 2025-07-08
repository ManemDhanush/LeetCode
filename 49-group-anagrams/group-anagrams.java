class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        for(String s: strs){
            char[] c = s.toCharArray();
            List<String> a;
            Arrays.sort(c);
            String ss = Arrays.toString(c);
            if(map.containsKey(ss)){
                a = map.get(ss);
            } else {
                a = new ArrayList<>();
            }
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