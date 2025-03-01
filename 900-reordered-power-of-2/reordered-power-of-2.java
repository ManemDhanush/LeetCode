class Solution {

    boolean hasPower = false;
    public boolean reorderedPowerOf2(int n) {
        ArrayList<Integer> list = new ArrayList<>();

        while(n!=0){
            list.add(n%10);
            n/=10;
        }

        boolean[] used = new boolean[list.size()];
        Collections.sort(list);

        dp(list, used, 0, 0);
        // System.out.println(list);
        return hasPower;
    }

    public void dp(ArrayList<Integer> list, boolean[] used, int count, int n){
        // System.out.println(visited);

        if(count == list.size()){
            if((n & (n - 1)) == 0 && n !=0) hasPower = true;
            return;
        }
        if(hasPower) return;

        for(int i=0; i<list.size(); i++) {
            if(used[i]) continue;
            if (count == 0 && list.get(i) == 0) continue;
            used[i] = true;
            // n = n*10 + x;
            dp(list, used, count + 1,  n*10 + list.get(i));
            used[i] = false;
        }
    } 



}