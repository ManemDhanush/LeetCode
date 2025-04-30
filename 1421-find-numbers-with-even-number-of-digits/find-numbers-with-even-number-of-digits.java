class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        for(int n: nums){
            if((n > 9 && n < 100) || (n > 999 && n < 10000) || (n > 99999 && n < 1000000) ) count++;
        }
        return count;
    }
}