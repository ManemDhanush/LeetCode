class Solution {
    public int findLHS(int[] nums) {
        int max = 0;
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int num: nums){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for(int num: nums){
            if(map.containsKey(num+1))
            max = Math.max(map.getOrDefault(num+1, 0) + map.getOrDefault(num, 0), max);
        }

        return max;
    }
}