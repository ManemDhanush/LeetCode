class Solution {
    public int maxContainers(int n, int w, int maxWeight) {

        if((n*n*w) - maxWeight > 0) return maxWeight / w;
        return n*n; 
    }
}