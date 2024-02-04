// https://leetcode.com/problems/contains-duplicate/

class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> unique = new HashSet<Integer>();
        for(int i: nums){
            if(unique.contains(i)){
                return true;
            }
            unique.add(i);
        }
        return false;
    }
}