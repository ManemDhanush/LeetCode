class Solution {
    public int findKthPositive(int[] arr, int k) {
        int max = arr[arr.length - 1];
        int curr = 1;
        int idx = 0;
        while(idx < arr.length && k!=0){
            // if(idx >= arr.length) curr++;
            if(arr[idx] > curr){
                k--;
            }
            else idx++;
            curr++;
        }
        return curr + k - 1;
    }
}