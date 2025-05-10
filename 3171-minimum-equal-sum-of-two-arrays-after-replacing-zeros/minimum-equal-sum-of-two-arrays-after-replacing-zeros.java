class Solution {
    public long minSum(int[] nums1, int[] nums2) {
        long num1Sum = 0;
        long num2Sum = 0;
        int num1Zero = 0;
        int num2Zero = 0;

        for(int num: nums1){
            num1Sum += num;
            if(num == 0){
                num1Zero++;
            }
        }

        for(int num: nums2){
            num2Sum += num;
            if(num == 0){
                num2Zero++;
            }
        }

        if(num1Zero == 0 && num2Zero == 0) {
            return num1Sum == num2Sum ? num1Sum : -1;
        }

        if(num1Zero == 0 && num1Sum < num2Sum + num2Zero) return -1;
        if(num2Zero == 0 && num2Sum < num1Sum + num1Zero) return -1;
        return Math.max(num2Sum + num2Zero, num1Sum + num1Zero);
    }
}