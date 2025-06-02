class Solution {
    public int candy(int[] ratings) {
        int n = ratings.length;
        int[] left = new int[n];
        int[] right = new int[n];
        int count = 0;

        left[0] = 1;
        right[n-1] = 1;

        for (int i = 1, j = n - 2; i < n; ++i, --j) {
            left[i] = ratings[i] > ratings[i - 1] ? left[i - 1] + 1 : 1;
            right[j] = ratings[j] > ratings[j + 1] ? right[j + 1] + 1 : 1;
        }


        for(int i=0; i<n; i++){
            count += Math.max(left[i], right[i]);
        }

        return count;

    }
}