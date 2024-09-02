class Solution {
    public int chalkReplacer(int[] chalk, int k) {
        long cumSum = 0;
        // System.out.println(cumSum);
        // while(k - cumSum >= 0) k -= cumSum;
        // if(k==0) return 0;
        for(int i=0; i<chalk.length; i++){
            cumSum+=chalk[i];
            if(cumSum > k) break;
        }
        k %= cumSum;
        for(int i=0; i<chalk.length; i++){
            // System.out.println()
            k-=chalk[i];
            if(k<0) return i;
        }
        // for(int c: chalk) cumSum
        return 0;
    }
}