class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        Map<String, Integer> map = new HashMap<>();
        String[] str1 = s1.split(" ");
        String[] str2 = s2.split(" ");
        ArrayList<String> ans = new ArrayList<>();
        for(String s: str1){
            map.put(s, map.getOrDefault(s, 0) + 1);
        }
        for(String s: str2){
            map.put(s, map.getOrDefault(s, 0) + 1);
        }
        for(String s: map.keySet()){
            if(map.get(s) == 1) {
                ans.add(s);
            }
        }
        return ans.toArray(new String[0]);
    }
}