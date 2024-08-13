class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        for(int n: arr){
            map.put(n, map.getOrDefault(n, 0) + 1);
        }

        List<Integer> list = new ArrayList<Integer>(map.values());
        Set<Integer> set = new HashSet<Integer>(map.values());

        return list.size() == set.size();
    }
}