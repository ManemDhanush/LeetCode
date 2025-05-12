class Solution {
    public int distMoney(int money, int children) {
        
        int ans = 0;
        
        if(money < children) return -1;
        if(money > children * 8) return children - 1;

        while(money>0 && money - 8 >= children - 1){
            children--;
            money -= 8;
            ans++;
        }

        if(money == 4 && children == 1) return ans - 1;
        return ans;
    }
}