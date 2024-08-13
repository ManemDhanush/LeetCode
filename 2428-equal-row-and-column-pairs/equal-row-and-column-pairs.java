class Solution {
    public int equalPairs(int[][] grid) {
        int count = 0;
        Map<String, Integer> map = new HashMap<>();
        StringBuffer sbRow = new StringBuffer();

        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[0].length; j++){
                sbRow.append(grid[i][j]);
                sbRow.append("+");
            }
            map.put(sbRow.toString(), map.getOrDefault(sbRow.toString(), 0) + 1);
            sbRow.setLength(0);
        }

        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[0].length; j++){
                sbRow.append(grid[j][i]);
                sbRow.append("+");
            }
            count += map.getOrDefault(sbRow.toString(),0);
            sbRow.setLength(0);
        }
        
        return count;
    }
}