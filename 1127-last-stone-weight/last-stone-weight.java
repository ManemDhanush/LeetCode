class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue pq = new PriorityQueue<>(stones.length, Collections.reverseOrder() );
        for(int stone: stones){
            pq.add(stone);
        }
        while(pq.size()>1){
            // System.out.println(pq);
            int x = (int)pq.peek();
            pq.poll();
            int y = (int)pq.peek();
            pq.poll();
            int z = Math.abs(x-y);
            if(z==0) continue;
            else pq.add(z);
        }
        return pq.peek() == null ? 0 : (int)pq.peek();
    }
}