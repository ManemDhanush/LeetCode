class Solution {
    public int minTotal = Integer.MAX_VALUE;
    public int minimumTotal(List<List<Integer>> triangle) {
        for(int i=triangle.size() -2; i>=0; i--){
            List<Integer> currLevel = triangle.get(i);
            List<Integer> nextLevel = triangle.get(i+1);

            for(int j=0; j<currLevel.size(); j++){
                currLevel.set(j, Math.min(nextLevel.get(j) + currLevel.get(j), nextLevel.get(j+1) + currLevel.get(j)));
            }

        }

        return triangle.get(0).get(0);
        // return dp(triangle, 0, 0, 0);
        // return minTotal;
    }
    public void dp(List<List<Integer>> triangle, int idx, int total, int height){
        // if(height == triangle.size()){
        //     minTotal = Math.min(minTotal, total);
        //     return;
        // }
        // List<Integer> curr = triangle.get(height);
        // // System.out.println(curr);
        // dp(triangle, idx, total + curr.get(idx), height+1);
        // if(idx+1 < curr.size()) 
        // dp(triangle, idx+1, total + curr.get(idx+1), height+1);
        
    }
}