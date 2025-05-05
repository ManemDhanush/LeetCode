class Solution {
    public int numEquivDominoPairs(int[][] dominoes) {
        HashMap<String, Integer> map = new HashMap<>();
        int ans = 0;

        for(int[] d: dominoes){
            int min = Math.min(d[0], d[1]);
            int max = Math.max(d[0], d[1]);

            map.put(min+"+"+max, map.getOrDefault(min+"+"+max, 0) + 1);
        }

        for(int x: map.values()){
            if(x>1){
                ans+=((x)*(x-1)/2);
            }
        }
        return ans;
    }
}