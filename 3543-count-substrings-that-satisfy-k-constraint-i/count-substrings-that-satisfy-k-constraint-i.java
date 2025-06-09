class Solution {
    public int countKConstraintSubstrings(String s, int k) {
        int count = 0;
        int numOnes = 0;
        int numZero = 0;
        int right = 0;
        int left = 0;
        while(right < s.length()){
            if(s.charAt(right) == '1'){
                numOnes++;
            } else {
                numZero++;
            }

            while (numOnes > k && numZero > k) {
                if (s.charAt(left) == '1') numOnes--;
                else numZero--;
                left++;
            }
            count+=(right - left + 1);;
            right++;
        }

        return count;
    }
}