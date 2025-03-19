class Solution {
    public int minOperations(int[] nums) {
        int count = 0;

        for(int i=0; i<nums.length; i++) {
            if(nums[i] == 0) {
                if(i+2 > nums.length-1) return -1;
                nums[i+1] ^= 1;
                nums[i+2] ^= 1;
                count++;
            }
        }

        // System.out.println("count " + count);

        return count;
    }
}