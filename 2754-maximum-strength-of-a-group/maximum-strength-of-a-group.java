class Solution {
    public long maxStrength(int[] nums) {
        List<Integer> positive = new ArrayList<>();
        List<Integer> negative = new ArrayList<>();
        boolean hasZero = false;
        
        Arrays.sort(nums);

        for(int n: nums){
            if(n>0) positive.add(n);
            else if(n<0) negative.add(n);
            else hasZero = true;
        }

        if (positive.isEmpty() && negative.size() < 2) {
            if (negative.isEmpty()) return hasZero ? 0 : nums[0];
            return nums.length == 1 ? nums[0] : 0;
        }
        
        long[] ans = new long[1];
        // ans[0] = nums[0];
        if(negative.size() > 1 || positive.size() > 0)
        ans[0] = 1;

        if(negative.size() % 2 != 0){
            negative.removeLast();
        }
        negative.forEach(x -> ans[0] = ans[0]*x);
        positive.forEach(x -> ans[0] = ans[0]*x);

        return  ans[0];
    }
}