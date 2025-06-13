class Solution {
    public boolean isInterleave(String s1, String s2, String s3) {
        if (s1.length() + s2.length() != s3.length()) return false;
        boolean[][] dp = new boolean[s1.length()+1][s2.length()+1];
        dp[0][0] = true;

        for(int i=0; i<=s1.length(); i++){
            for(int j=0; j<=s2.length(); j++){
                if (i == 0 && j == 0) continue;
                
                if (i > 0 && s1.charAt(i - 1) == s3.charAt(i + j - 1)) {
                    dp[i][j] |= dp[i - 1][j];
                }

                if (j > 0 && s2.charAt(j - 1) == s3.charAt(i + j - 1)) {
                    dp[i][j] |= dp[i][j - 1];
                }
            }
        }

        return dp[s1.length()][s2.length()];


        // Queue<int[]> q = new LinkedList<>();
        // Set<String> visited = new HashSet<>();
        // q.add(new int[]{0,0,0});

        // while(!q.isEmpty()){
        //     int[] idx = q.poll();
        //     int i = idx[0], j = idx[1], k = idx[2];

        //     String key = i + "," + j;
        //     if (visited.contains(key)) continue;
        //     visited.add(key);

        //     if(idx[2] == s3.length()){
        //        return true;
        //     }
        //     if(i < s1.length() && s1.charAt(i) == s3.charAt(k)){
        //         q.offer(new int[]{i+1, j, k+1});
        //     }
        //     if(j < s2.length() && s2.charAt(j) == s3.charAt(k)){
        //         q.offer(new int[]{i, j+1, k+1});
        //     }
        // }
        // return false;
    }
}