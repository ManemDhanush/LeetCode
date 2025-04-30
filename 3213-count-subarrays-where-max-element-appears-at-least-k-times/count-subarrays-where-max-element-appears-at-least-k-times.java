class Solution {
    public long countSubarrays(int[] nums, int k) {
        int left = 0;
        int max = Arrays.stream(nums).max().getAsInt();
        int count = 0;
        long ans = 0;

        for(int right=0; right<nums.length; right++){
            if(nums[right] == max) count++;
            while(count>=k){
                ans+=nums.length - right;
                if(nums[left] == max) count--;
                left++;
            }
        }

        return ans;
    }
}