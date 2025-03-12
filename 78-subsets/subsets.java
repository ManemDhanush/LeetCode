class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        backTrack(new ArrayList<Integer>(), nums, nums.length, 0);
        return ans;
    }

    public void backTrack(List<Integer> list, int[] nums, int size, int height){
        if(height >= size) {
            ans.add(new ArrayList<>(list));
            return;
        }

        backTrack(list, nums, size, height + 1);

        list.add(nums[height]);

        backTrack(list, nums, size, height + 1);

        list.remove(list.size() - 1);
    }
}