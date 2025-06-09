class Solution {
    public int countKConstraintSubstrings(String s, int k) {
        int count = 0;

        for(int i=0 ; i<s.length(); i++){
            int numOnes = 0;
            int numZero = 0;

            for(int j=i; j<s.length(); j++){
                if(s.charAt(j) == '1'){
                    numOnes++;
                }
                else{
                    numZero++;
                }
                if(numOnes <= k || numZero <= k) count++;
            }
        }



        return count;
    }
}