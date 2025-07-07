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
            if(map.containsKey(s.charAt(i))){
                Pair p = map.get(s.charAt(i));
                p.increment();
                map.put(s.charAt(i), p);
            } else {
                map.put(s.charAt(i), new Pair(i,1));
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