class Solution {
    public int[] findOriginalArray(int[] changed) {
        if(changed.length % 2 != 0) return new int[]{};
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num: changed){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        Arrays.sort(changed);
        ArrayList<Integer> ans = new ArrayList<>();
        
        for(int i=0; i<changed.length; i++){

            if(map.get(changed[i]) == 0) continue;

            if(map.getOrDefault(changed[i] * 2, 0) == 0) return new int[0];

            ans.add(changed[i]);
            
            map.put(changed[i], map.get(changed[i]) - 1);
            map.put(changed[i] * 2, map.get(changed[i] * 2) - 1);
        }

        return ans.stream().mapToInt(x->x).toArray();
    }
}