class Solution {
    public int minimumDeletions(String s) {
        int countB = 0;
        int remove = 0;

        for(char c: s.toCharArray()){
            if(c == 'b'){
                countB++;
            } else {
                remove = Math.min(remove + 1, countB);
            }
        }
        return remove;
    }
}