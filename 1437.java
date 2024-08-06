class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = Integer.MIN_VALUE;
        List<Boolean> ans = new ArrayList<Boolean>(); 
        for(int candy: candies){
            max = Math.max(max, candy);
        }

        for(int candy: candies){
            ans.add((candy + extraCandies >= max ? true : false));
        }
        return ans;
    }
}