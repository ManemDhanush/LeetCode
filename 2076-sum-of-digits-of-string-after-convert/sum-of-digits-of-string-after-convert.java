class Solution {
    public int getLucky(String s, int k) {
        int ans = 0;
        // String str = "";
        for(char ch: s.toCharArray()){
            int sum1 = (int)(ch - 'a') + 1;
            while(sum1 != 0){
                // System.out.println(sum);
                ans += sum1%10;
                sum1 /= 10;
            }
            // str += sum + "";
            // System.out.println((int)(ch - 'a') + 1);
        }
        while(k-- > 1){
            int sum1 = 0;
            while(ans != 0){
                // System.out.println(ans);
                sum1 += ans%10;
                ans /= 10;
            }
            ans = sum1;
            // k--;
        }
        return ans;
    }
}