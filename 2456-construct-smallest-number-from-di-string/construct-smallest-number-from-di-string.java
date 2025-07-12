class Solution {
    public String smallestNumber(String pattern) {
        StringBuilder ans = new StringBuilder();
        Stack<Integer> stk = new Stack<>();
        int num = 0;

        for(int i=0; i<=pattern.length(); i++){
            stk.push(i+1);

            if(i == pattern.length() || pattern.charAt(i) == 'I'){
                while(!stk.isEmpty()){
                    ans.append(stk.peek());
                    stk.pop();
                }
            }
        }

        // while(!stk.isEmpty()){
        //     ans.append(stk.peek());
        //     stk.pop();
        // }

        return ans.toString();
    }
}