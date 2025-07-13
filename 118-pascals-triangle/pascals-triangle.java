class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        // List<Integer> 
        ans.add(new ArrayList<>(Collections.singletonList(1)));
        for(int i=0; i<numRows-1; i++){
            List<Integer> prevList = ans.get(i);
            List<Integer> newList = new ArrayList<>();

            for(int j=0; j<prevList.size() + 1; j++){
                if(j==0 || j==prevList.size()){
                    newList.add(1);
                } else {
                    newList.add(prevList.get(j-1) + prevList.get(j));
                }
            }

            ans.add(newList);
        }
        return ans;
    }
}