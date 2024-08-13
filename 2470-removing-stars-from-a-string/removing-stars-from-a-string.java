class Solution {
    public String removeStars(String s) {
        Stack<Character> stack = new Stack<Character>();
        
        for(char ch: s.toCharArray()){
            if(ch == '*'){
                stack.pop();
            } else {
                stack.push(ch);
            }
        }

        // System.out.println(stack.toString());

        return stack.stream().map(st -> st.toString()).collect(Collectors.joining(""));

    }
}