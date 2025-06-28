class Solution {
    public int[] maxSubsequence(int[] nums, int k) {
        // Arrays.sort(nums, Collections.reverseOrder());
        int[][] arridx = new int[nums.length][2];
        int ans[] = new int[k];
        for(int i=0; i<nums.length; i++){
            arridx[i][0] = nums[i];
            arridx[i][1] = i;
        }

        Arrays.sort(arridx, (x1, x2) -> Integer.compare(x2[0], x1[0]));
        Arrays.sort(arridx,0, k, (x1, x2) -> Integer.compare(x1[1], x2[1]));

        for(int i=0; i<k; i++){
            ans[i] = arridx[i][0];
        }
        return ans;
    }
}