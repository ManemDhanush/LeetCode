class Solution {
    public int numOfSubarrays(int[] arr) {
        int oC = 0, eC = 1;
        int count = 0;
        int sum = 0;

        for(int n: arr){
            sum+=n;
            if(sum%2 == 0){
                count+=oC;
                eC++;
            } else {
                count+=eC;
                oC++;
            }

            count %= 1_000_000_007;
        }

        return count;
    }
}