class Solution {
    public int findPairs(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        Set<Pair<Integer, Integer>> set = new HashSet<>();
        for(int n: nums){
            map.put(n, map.getOrDefault(n, 0) + 1);
        }

        for(int n: nums){
            // if(map.get())
            if(k == 0){
                if (map.get(n) > 1)
                // System.out.println(n + " " + k);
                set.add(new Pair<Integer,Integer>(n,n));
            }
            // System.out.println(map.get(n-k));
            else{
                if(map.containsKey(n+k)){
                    set.add(new Pair<Integer,Integer>(Math.min(n, n+k), Math.max(n, n+k)));
                }
            }
        }

        return set.size();

    }
}