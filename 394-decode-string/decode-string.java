class Solution {
    public String decodeString(String s) {

        Stack<Character> charStk = new Stack<>();
        Stack<Integer> intStk = new Stack<>();
        int num = 0;

        for(char c: s.toCharArray()){
            if(Character.isDigit(c)){
                num = num*10 + Character.getNumericValue(c);
            } else {
                if(num != 0){
                    intStk.push(num);
                    num = 0;
                }

                if(c == ']'){
                    StringBuffer sb = new StringBuffer();
                    while(!charStk.isEmpty() && charStk.peek() != '[' ){
                        sb.append(charStk.pop());
                    }
                    if(!charStk.isEmpty()){
                        charStk.pop();
                    }
                    int num1 = 1;
                    if(!intStk.isEmpty()){
                        num1 = intStk.pop();
                    }
                    String str = sb.reverse().toString();

                    for(int i=0; i<num1; i++){
                        for(int j=0; j<str.length(); j++){
                            charStk.push(str.charAt(j));
                        }
                    }

                    // System.out.println(charStk);
                } else {
                    charStk.push(c);
                }
            }
        }
        return String.join("", charStk.stream().map(x->x.toString()).toList());
    }
}