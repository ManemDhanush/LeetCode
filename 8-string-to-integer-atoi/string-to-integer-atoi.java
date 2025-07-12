class Solution {
    public int myAtoi(String s) {
        if(s.length() == 0) return 0;

        int idx = 0;
        int sign = 1;
        int num = 0;

        while(idx < s.length() && s.charAt(idx) == ' '){
            idx++;
        }

        if(idx < s.length()){
            if(s.charAt(idx) == '-'){
                sign = -1;
                idx++;
            } else if(s.charAt(idx) == '+'){
                sign = 1;
                idx++;
            }
        }

        while(idx < s.length()){
            char c = s.charAt(idx);
            if(c < '0' || c > '9') break;

            int n = c - '0';

            if(num > (Integer.MAX_VALUE - n)/10){
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE; 
            }
            num = num * 10 + n;
            idx++;
        }
        return num * sign;
    }
}
