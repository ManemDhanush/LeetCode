class Solution {
    public char kthCharacter(int k) {
        int shifts = Integer.bitCount(k - 1);  
        return (char) ('a' + shifts % 26);
    }
}