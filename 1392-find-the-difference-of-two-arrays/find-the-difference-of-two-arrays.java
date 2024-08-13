class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        Set<Integer> set1 = Arrays.stream(nums1).boxed().collect(Collectors.toSet());
        Set<Integer> set2 = Arrays.stream(nums2).boxed().collect(Collectors.toSet());
        List<Integer> list1 = set1.stream().filter(num -> !set2.contains(num)).collect(Collectors.toList());
        List<Integer> list2 = set2.stream().filter(num -> !set1.contains(num)).collect(Collectors.toList());
        ans.add(list1);
        ans.add(list2);

        return ans;
    }
}