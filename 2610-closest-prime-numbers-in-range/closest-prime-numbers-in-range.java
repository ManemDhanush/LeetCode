class Solution {
    public int[] closestPrimes(int left, int right) {
        int prime1 = -1;
        int prime2 = -1;
        int[] ans = new int[] {-1, -1};

        boolean[] isPrime = sieve(right);

        for (int i = left; i <= right; i++) {
            if (isPrime[i]) {
                prime1 = prime2;
                prime2 = i;

                if (prime1 == -1) continue;
                if (ans[0] == -1 || ans[1] - ans[0] > prime2 - prime1) {
                    ans[0] = prime1;
                    ans[1] = prime2;
                }
            }
        }
        return ans;
    }

    private boolean[] sieve(int n) {
        boolean[] isPrime = new boolean[n + 1];
        Arrays.fill(isPrime, true);
        isPrime[0] = isPrime[1] = false;

        for (int i = 2; i * i <= n; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= n; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        return isPrime;
    }
}