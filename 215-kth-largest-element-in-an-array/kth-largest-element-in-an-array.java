class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue <Integer> pq = new PriorityQueue<>(k, Collections.reverseOrder());
        for(int num: nums) {
            pq.add(num);
        }
        for(int i=1; i<k; i++){
            pq.poll();
        }
        return pq.poll();
    }
}