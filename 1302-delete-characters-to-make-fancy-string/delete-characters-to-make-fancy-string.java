class Solution {
    public String makeFancyString(String s) {
        StringBuilder sb = new StringBuilder();
        char prevChar = ' ';
        int count = 0;
        for(char c: s.toCharArray()){
            if(prevChar == c){
                count++;
            } else {
                prevChar = c;
                count = 1;
            }

            if(count < 3){
                sb.append(c);
            }
        }
        return sb.toString();
    }
}