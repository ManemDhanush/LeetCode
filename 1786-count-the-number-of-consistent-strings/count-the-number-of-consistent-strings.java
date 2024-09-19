class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        Map<Character, Integer> map = new HashMap<>();
        int count = 0;
        for(char c: allowed.toCharArray()){
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for(String word: words){
            boolean flag = true;
            for(char c: word.toCharArray()){
                if(map.getOrDefault(c, -1) == -1){
                    flag = false;
                    break;
                }
            }
            if(flag){
                count++;
            }
        }
        return count;
    }
}