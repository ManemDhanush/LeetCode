class Solution {
    public String decodeString(String s) {


        Stack<Character> stack = new Stack<>();
        StringBuilder str = new StringBuilder();
        StringBuilder num = new StringBuilder();

        for(char ch: s.toCharArray()){
            if(ch == ']'){
                // String str = "";
                while(!stack.isEmpty() && stack.peek() != '['){
                    // str = stack.pop() + str;
                    str.insert(0,stack.pop());
                }
                stack.pop();
                // String num = "";
                while(!stack.isEmpty() && Character.isDigit(stack.peek())){
                    // num = stack.pop() + num;
                    num.insert(0,stack.pop());
                }

                // System.out.println(str);
                // System.out.println(num);

                for(int i=0; i<Integer.parseInt(num.toString()); i++){
                    for(char c: str.toString().toCharArray()){
                        stack.push(c);
                    }
                }

                num.setLength(0);
                str.setLength(0);
            } else {
                stack.push(ch);
            }
        }
        // System.out.println(stack);
        return stack.stream().map(String::valueOf).collect(Collectors.joining(""));
    }
}