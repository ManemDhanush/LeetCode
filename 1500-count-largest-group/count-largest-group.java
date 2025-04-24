class Solution {
    public int countLargestGroup(int n) {
        Map<Integer, Integer> map = new HashMap<>();
        int max = 0;
        for(int i=1; i<=n; i++){
            int digitSum = 0;
            int temp = i;
            while(temp!=0){
                digitSum+=temp%10;
                temp/=10;
            }
            map.put(digitSum, map.getOrDefault(digitSum, 0) +1);
            max = Math.max(max, map.get(digitSum));
        }

        int count = 0;
        for(int x: map.values()){
            if(x == max) count++;
        }
        return count;
    }
}