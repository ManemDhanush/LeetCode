class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(stones.length, Collections.reverseOrder() );
        for(int stone: stones){
            pq.add(stone);
        }
        while(pq.size()>1){
            int x = pq.poll();
            int y = pq.poll();
            pq.add(Math.abs(x-y));
        }
        return pq.peek();
    }
}