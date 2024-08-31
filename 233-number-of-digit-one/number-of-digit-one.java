class Solution {

    static Map<Integer, Integer> map = new HashMap<>();

    static {
        map.put(0, 0);
        for (int i = 0; i <= 9; i++) {
            map.put(i + 1, (int)Math.pow(10, i));
        }
    }

    public int countDigitOne(int n) {
        int currSum = 0;
        int currIndex = 1;
        int copy = n;
        int len = 1;

        while(copy > 0){
            int rem = copy % 10;
            int quotient = n / currIndex;
            int curVal;

            if (rem == 0) {
                curVal = (quotient / 10) * map.get(len);
            } else if (rem == 1) {
                curVal = (quotient / 10) * map.get(len) + (n % currIndex) + 1;
            } else {
                curVal = ((quotient / 10) + 1) * map.get(len);
            }

            currSum += curVal;
            copy /= 10;
            len++;
            currIndex *= 10;
        }

        return currSum;
    }
}