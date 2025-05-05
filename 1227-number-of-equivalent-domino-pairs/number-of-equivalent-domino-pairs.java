class Solution {
    public int numEquivDominoPairs(int[][] dominoes) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int ans = 0;

        for(int[] d: dominoes){
            int min = Math.min(d[0], d[1]);
            int max = Math.max(d[0], d[1]);
            int encode = max*10+min;

            map.put(encode, map.getOrDefault(encode, 0) + 1);
            if(map.get(encode) > 1) ans+=map.get(encode)-1;
        }
        return ans;
    }
}