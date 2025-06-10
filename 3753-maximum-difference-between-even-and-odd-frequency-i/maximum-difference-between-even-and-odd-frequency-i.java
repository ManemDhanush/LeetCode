class Solution {
    public int maxDifference(String s) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(char c: s.toCharArray()){
            map.put(c-'a', map.getOrDefault(c-'a', 0) + 1);
        }
        int maxOdd = Integer.MIN_VALUE, minEven = Integer.MAX_VALUE;
        for(int i: map.values()){
            if(i%2==0){
                // maxEven = Math.max(maxEven, i);
                minEven = Math.min(minEven, i);
            } else {
                maxOdd = Math.max(maxOdd, i);
                // minOdd = Math.min(minOdd, i);
            }
        }

        return maxOdd - minEven; 
    }
}