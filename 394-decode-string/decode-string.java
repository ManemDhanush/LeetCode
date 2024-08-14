class Solution {
    public String decodeString(String s) {


        Stack<Character> stack = new Stack<>();

        for(char ch: s.toCharArray()){
            if(ch == ']'){
                String str = "";
                while(!stack.isEmpty() && stack.peek() != '['){
                    str = stack.pop() + str;
                }
                stack.pop();
                String num = "";
                while(!stack.isEmpty() && Character.isDigit(stack.peek())){
                    num = stack.pop() + num;
                }

                // System.out.println(str);
                // System.out.println(num);

                for(int i=0; i<Integer.parseInt(num); i++){
                    for(char c: str.toCharArray()){
                        stack.push(c);
                    }
                }
            } else {
                stack.push(ch);
            }
        }
        // System.out.println(stack);
        return stack.stream().map(String::valueOf).collect(Collectors.joining(""));
    }
}