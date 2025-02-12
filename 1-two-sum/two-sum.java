class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> a = new HashMap<>();

        for(int n=0; n<nums.length; n++) {
            if(a.containsKey(target - nums[n])){
                return new int[] {n, a.get(target - nums[n])};
            }
            a.put(nums[n], n);
        }

        // System.out.println(a);

        return null;
    }
}