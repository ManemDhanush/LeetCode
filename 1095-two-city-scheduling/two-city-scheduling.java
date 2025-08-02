class Solution {
    public int twoCitySchedCost(int[][] costs) {
        int ans = 0;
        Arrays.sort(costs, (a, b) -> (a[0] - a[1]) - (b[0] - b[1]));

        for(int i=0; i<costs.length/2; i++){
            ans+= costs[i][0] + costs[costs.length / 2 + i][1];
        }
        return ans;
    }
}