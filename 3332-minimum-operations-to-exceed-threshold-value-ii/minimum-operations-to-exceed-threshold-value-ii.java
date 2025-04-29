class Solution {
    public int minOperations(int[] nums, int k) {
        PriorityQueue<Long> pq = new PriorityQueue<>();

        for(int num: nums){
            pq.add((long)num);
        }


        for(int i=0; i<nums.length; i++){
            if(pq.peek() >= k) return i;
            long x = pq.poll();
            long y = pq.poll();
            pq.add(x * 2 + y);
        }
        return nums.length;
    }
}