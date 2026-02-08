class Solution {
    public int maxTurbulenceSize(int[] arr) {
        int count = 1;
        int prevCompare = 0;
        int start = 0;

        for(int i=1; i<arr.length; i++){
            int currCompare = Integer.compare(arr[i-1], arr[i]);
            if(prevCompare * currCompare == -1){

            } else if(currCompare == 0) {
                start = i;
            } else {
                start = i - 1;
            }
            count = Math.max(count, i - start + 1);
            prevCompare = currCompare;
        }

        return count;
    }
}