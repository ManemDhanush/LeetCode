class Solution {
    public int maxOperations(int[] nums, int k) {
        // Hashtable<Integer, Integer> hashtable = new Hashtable<>();
        HashMap<Integer, Integer> hashtable = new HashMap<Integer, Integer>();
        int ans = 0;
        for(int num: nums){
            hashtable.put(num, hashtable.getOrDefault(num, 0) + 1);
        }

        for(int num: nums){
            int target = k - num;
            if(target == num && hashtable.getOrDefault(target, -9) > 1){
                // System.out.println(hashtable.getOrDefault(target, -9));
                hashtable.put(target, hashtable.get(target) - 2);
                ans++;
            }
            else if(target != num && hashtable.getOrDefault(target, -9) > 0 && hashtable.getOrDefault(num, -9) > 0){
                hashtable.put(target, hashtable.get(target) - 1);
                hashtable.put(num, hashtable.get(num) - 1);
                ans++;
            }
            // System.out.println(hashtable.toString());
        }
        // System.out.println(hashtable.toString());
        return ans;
    }
}