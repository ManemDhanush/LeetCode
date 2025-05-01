class Solution {
    public String compressedString(String word) {
        char prevChar=word.charAt(0);
        int prevCount=0;
        StringBuilder sb = new StringBuilder();

        for(char w: word.toCharArray()){
            if(prevChar == w && prevCount < 9){
                prevCount++;
            } else {
                sb.append(prevCount);
                sb.append(prevChar);
                prevCount = 1;
                prevChar = w;
            }
        }

        sb.append(prevCount);
        sb.append(prevChar);

        return sb.toString();
    }
}