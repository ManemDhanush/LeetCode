class Solution {
    public int minOperations(int[] nums, int k) {
        PriorityQueue<Long> pq = new PriorityQueue<>();

        for(int num: nums){
            pq.add((long)num);
        }


        for(int i=0; i<nums.length; i++){
            if(pq.peek() >= k) return i;
            // System.out.println(pq);
            long x = pq.poll();
            long y = pq.poll();
            pq.add((Math.min(x,y) * 2) + Math.max(x,y));
        }
        return nums.length;
    }
}