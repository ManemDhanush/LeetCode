class Solution {
    public String predictPartyVictory(String senate) {
        Deque<Integer> r = new ArrayDeque<>();
        Deque<Integer> d = new ArrayDeque<>();
        int len = senate.length();
        for(int i=0; i<senate.length(); i++){
            if(senate.charAt(i) == 'R')
            r.offerLast(i);
            else
            d.offerLast(i);
        }
        while(!r.isEmpty() && !d.isEmpty()){
            if(r.peekFirst() < d.peekFirst()) r.offerLast(len++);
            else d.offerLast(len++);

            r.pollFirst();
            d.pollFirst();
        }

        return r.isEmpty() ? "Dire" : "Radiant";

    }
}