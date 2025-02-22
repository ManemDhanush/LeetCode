class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<Pair> pq = new PriorityQueue<>(k, Collections.reverseOrder());

        for(int[] point: points){
            int d = point[0] * point[0] + point[1] * point[1];
            Pair p = new Pair(d, point[0], point[1]);
            pq.add(p);
            // pq.add(Pair(((point[0] * point[0]) + (point[1] * point[1])), point[0], point[1]));
        }

        int ans[][] = new int[k][2];

        for(int i=0; i<k; i++){
            Pair p = pq.poll();
            ans[i][0] = p.x;
            ans[i][1] = p.y;
        }

        return ans;
    }
}
class Pair implements Comparable<Pair>{
    int distance;
    int x,y;

    public Pair(int distance, int x, int y){
        this.distance = distance;
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(Pair other) {
        return Integer.compare(other.distance, this.distance);
    }
}