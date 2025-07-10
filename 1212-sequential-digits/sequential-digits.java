class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        String s = "123456789";
        int window = 2;
        ArrayList<Integer> ans = new ArrayList<>();

        while (window <= 9) {
            int left = 0;
            int right = left + window;

            while (right <= 9) {
                int num = Integer.parseInt(s.substring(left, right));
                if (num >= low && num <= high) {
                    ans.add(num);
                }
                left++;
                right++;
            }

            window++;
        }

        return ans;
    }
}