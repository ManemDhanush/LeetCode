class Solution {
    public boolean checkString(String s) {
        return s.indexOf('b') == -1 || s.lastIndexOf('a') == -1 || s.indexOf('b') > s.lastIndexOf('a');
    }
}