class Solution {
    public int longestSubarray(int[] nums) {
        int count = 0;
        int maxCount = 0;
        boolean skipped = false;
        ArrayList<Integer> list = new ArrayList<>(); 
        for(int i=0; i<nums.length; i++){
            if(nums[i] == 1){
                count++;
            } else {
                list.add(count);
                count = 0;
                list.add(count);
            }
        }
        list.add(count);
        // System.out.print(list);
        int first = 0, second = 0, third = 0;
        for(int i=0; i<list.size(); i++){
            third = second;
            second = first;
            first = list.get(i);

            maxCount = Math.max(maxCount, first + second + third);
        }
        if(maxCount == nums.length){
            return maxCount - 1;
        }

        return maxCount;
    }
}