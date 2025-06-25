class Solution {
    public int maximumSum(int[] arr) {
        int max = arr[0];
        int currMax = arr[0];
        int skipMax = 0;

        for(int i=1; i<arr.length; i++){
            skipMax = Math.max(skipMax  + arr[i], currMax);
            currMax = Math.max(currMax + arr[i], arr[i]);
            max = Math.max(max, Math.max(currMax, skipMax));
        }

        return max;
    }
}