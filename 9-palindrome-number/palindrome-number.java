class Solution {
    public boolean isPalindrome(int x) {
        if(x<0) return false;
        int revNum = 0;
        int curNum = x;
        while(x>0){
            revNum = revNum * 10 + x % 10;
            x /= 10;
        }
        return revNum == curNum;
    }
}