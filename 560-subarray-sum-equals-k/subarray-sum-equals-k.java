class Solution {
    public int subarraySum(int[] nums, int k) {
        int n = nums.length;
        Map<Integer, Integer> map = new HashMap<>();
        int prefixSum = 0;

        map.put(0, 1);
        int count = 0;
        // prefixSum[0] = nums[0];

        for(int i=0; i<n; i++){
            prefixSum += nums[i];

            if(map.containsKey(prefixSum - k)){
                count+= map.get(prefixSum - k);
            }

            map.put(prefixSum, map.getOrDefault(prefixSum, 0)+1);
        }

        // System.out.println(map.toString());


        // for(int i=0; i<n; i++){
        //     count+= map.getOrDefault(k-prefixSum[i], 0);
        //     count+= map.getOrDefault(k, 0);
        // }

        return count;

    }
}