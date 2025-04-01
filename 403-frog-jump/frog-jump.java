class Solution {
    public boolean canCross(int[] stones) {
        // int diff = 0;
        // for(int i=1; i<stones.length; i++){
        //     int currDiff = stones[i] - stones[i-1];
        //     if(Math.abs(currDiff - diff) > 1) return false;
        //     diff = currDiff;
        //     System.out.println(diff);
        // }
        HashMap<Integer, HashSet<Integer>> map = new HashMap<>();
        for (int stone : stones) {
            map.put(stone, new HashSet<>());
        }
        map.get(0).add(0);

        for (int stone : stones) {
            for (int jump : map.get(stone)) {
                for (int step = jump - 1; step <= jump + 1; step++) {
                    if (step > 0 && map.containsKey(stone + step)) {
                        map.get(stone + step).add(step);
                    }
                }
            }
        }

        return !map.get(stones[stones.length - 1]).isEmpty();
    }
}