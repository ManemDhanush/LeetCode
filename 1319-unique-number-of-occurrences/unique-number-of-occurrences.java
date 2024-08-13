class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        for(int n: arr){
            map.put(n, map.getOrDefault(n, 0) + 1);
        }

        Set<Integer> set = new HashSet<Integer>(map.values());

        return map.size() == set.size();
    }
}