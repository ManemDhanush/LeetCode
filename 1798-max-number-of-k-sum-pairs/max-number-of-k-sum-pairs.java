class Solution {
    public int maxOperations(int[] nums, int k) {
        HashMap<Integer, Integer> hashtable = new HashMap<>();
        int ans = 0;
        
        for(int num: nums){
            int target = k - num;
            if(hashtable.getOrDefault(target, 0) > 0) {
                ans++;
                hashtable.put(target, hashtable.get(target) - 1);
            } else {
                hashtable.put(num, hashtable.getOrDefault(num, 0) + 1);
            }
        }
        
        return ans;
    }
}
