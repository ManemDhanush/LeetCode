class Solution {
    class Pair{
        int index, freq;
        Pair(int index, int freq){
            this.index = index;
            this.freq = freq;
        }
        void increment(){
            this.freq++;
        }
    }
    public int firstUniqChar(String s) {
        HashMap<Character, Pair> map = new HashMap<>();
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(map.containsKey(s.charAt(i))){
                map.get(c).increment();
            } else {
                map.put(c, new Pair(i,1));
            }
        }

        int min = Integer.MAX_VALUE;

        for(Pair p: map.values()){
            if(p.freq == 1){
                min = Math.min(min, p.index);
            }
        }

        return min == Integer.MAX_VALUE ? -1 : min;
    }
}