class Solution {
    public int findLucky(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int ans = -1;

        for(int a: arr){
            map.put(a, map.getOrDefault(a, 0) + 1);
        }

        for(int x: map.keySet()){
            if(map.get(x) == x){
                ans = Math.max(ans, x);
            }
        }

        return ans;
    }
}