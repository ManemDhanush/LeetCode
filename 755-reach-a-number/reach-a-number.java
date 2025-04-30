class Solution {
    public int reachNumber(int target) {
        target = Math.abs(target);
        int offset = 0;
        
        while (target > 0) {
            target -= ++offset;
        }
        
        int ans = target % 2 == 0 ? offset : offset + 1 + (offset % 2);
        return ans;
    }
}
