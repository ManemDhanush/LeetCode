class Solution {
    public int findDuplicate(int[] nums) {
        int slowPointer = nums[0];
        int fastPointer = nums[0];
        while (true) {
            slowPointer = nums[slowPointer];
            fastPointer = nums[nums[fastPointer]];
            if (slowPointer == fastPointer) {
                break;
            }
        }

        slowPointer = nums[0];
        while (slowPointer != fastPointer) {
            slowPointer = nums[slowPointer];
            fastPointer = nums[fastPointer];
        }
        return slowPointer;
    }
}