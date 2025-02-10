class Solution {
    public int numberOfChild(int n, int k) {
        n--;
        if((k/n) % 2 == 0) return k%n;
        return n - k%n;
    }
}