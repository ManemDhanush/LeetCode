class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        List<Integer> list1 = new ArrayList<Integer>();
        List<Integer> list2 = new ArrayList<Integer>();
        Set<Integer> set1 = Arrays.stream(nums1).boxed().collect(Collectors.toSet());
        Set<Integer> set2 = Arrays.stream(nums2).boxed().collect(Collectors.toSet());
        
        for(int num: set1){
            if(!set2.contains(num)){
                list1.add(num);
            }
        }

        for(int num: set2){
            if(!set1.contains(num)){
                list2.add(num);
            }
        }

        ans.add(list1);
        ans.add(list2);

        return ans;
    }
}