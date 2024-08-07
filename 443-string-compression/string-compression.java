class Solution {
    public int compress(char[] chars) {
        int index = 0;
        int count = 1;
        if(chars.length < 2){
            return chars.length;
        }
        char prevChar = chars[0];
        for(int i=1; i<=chars.length; i++){
            if (i < chars.length && chars[i] == prevChar) {
                count++;
            }
            else{
                chars[index++] = prevChar;
                if(count > 1){
                    char[] ch = Integer.toString(count).toCharArray();
                    for(char c: ch){
                        chars[index++] = c;
                    }
                }
                if (i < chars.length) {
                    prevChar = chars[i];
                    count = 1;
                }
            }
        }
        return index;
    }
}