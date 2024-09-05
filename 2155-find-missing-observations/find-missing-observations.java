class Solution {
    public int[] missingRolls(int[] rolls, int mean, int n) {
        
        int sum = Arrays.stream(rolls).sum();

        double avg = ((mean * (rolls.length + n)) - sum) * 1.0 / n;
        int mod = ((mean * (rolls.length + n)) - sum) % n;
        if(avg > 6 || avg < 1) return new int[0];

        int[] ans = new int[n];
        for(int i=0; i<n; i++){
            ans[i] = (int)avg;
        }
        for(int i=0; i<mod; i++){
            ans[i]++;
        }
        
        return ans;
    }
}