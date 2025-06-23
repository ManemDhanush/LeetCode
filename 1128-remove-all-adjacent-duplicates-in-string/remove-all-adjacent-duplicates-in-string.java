class Solution {
    public String removeDuplicates(String s) {
        Deque<Character> stk = new ArrayDeque<>();
        for(char c: s.toCharArray()){
            if(!stk.isEmpty() && stk.peekLast() == c){
                stk.pollLast();
            } else {
                stk.offerLast(c);
            }
        }

        StringBuilder sb = new StringBuilder();

        while(!stk.isEmpty()){
            sb.append(stk.pollFirst());
        }

        return sb.toString();
    }
}