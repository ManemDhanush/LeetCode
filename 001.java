// https://leetcode.com/problems/two-sum/

class Solution {
    public int[] twoSum(int[] nums, int target) {

        // create a hash map that stores the value and index of nums
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();

        // store value and index
        for(int i=0; i< nums.length; i++){
            hm.put(nums[i], i);
        }

        for(int i=0; i< nums.length; i++){
            // check if the hashmap contains target - nums[i] => required number;
            // this is better than looping through nums[i] + hm values => target
            if( hm.containsKey(target - nums[i]) == true && hm.get(target - nums[i]) != i )
            return new int[] {i,hm.get(target - nums[i]) };
        }

        return null;
    }
}