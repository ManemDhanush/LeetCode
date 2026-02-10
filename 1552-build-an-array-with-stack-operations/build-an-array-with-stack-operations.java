class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> ans = new ArrayList<>();
        int currIndex = 0;
        for(int i = 1; i <= n; i++){
            if(target[currIndex] == i){
                ans.add("Push");
                currIndex++;
            } else {
                ans.add("Push");
                ans.add("Pop");
            }
            if(currIndex == target.length){
                break;
            }
        }
        return ans;
    }
}