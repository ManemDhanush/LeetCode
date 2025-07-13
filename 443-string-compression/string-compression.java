class Solution {
    public int compress(char[] chars) {
        int num = 0;
        char prevChar = chars[0];
        int idx = 0;
        StringBuilder ans = new StringBuilder();

        for(int i=0; i<chars.length; i++){
            if(prevChar != chars[i]){
                chars[idx++] = prevChar;
                // ans.append(prevChar);
                if(num!=1){
                    String countStr = String.valueOf(num);
                    for (char c : countStr.toCharArray()) {
                        chars[idx++] = c;
                    }
                }
                // ans.append(num);
                num = 1;
                prevChar = chars[i];
            } else {
                num++;
            }
        }
        // ans.append(prevChar);
        chars[idx++] = prevChar;
        if(num!=1){
            String countStr = String.valueOf(num);
            for (char c : countStr.toCharArray()) {
                chars[idx++] = c;
            }
        }
        // ans.append(num);

        // for(int i=0; i<ans.length(); i++){
        //     chars[i] = ans.charAt(i);
        // }

        return idx;
    }
}