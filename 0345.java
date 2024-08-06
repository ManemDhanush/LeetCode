class Solution {
    boolean isVowel(char c){
        switch(c){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
            return true;
            default: 
            return false;
        }
    }
    public String reverseVowels(String s) {
        int i = 0, j = s.length() - 1;
        char[] arr = s.toCharArray();
        boolean vowelLeft = false, vowelRight = false;
        while(i < j){
            if(isVowel(s.charAt(i))){
                vowelLeft = true;
            } else {
                i++;
            }
            if(isVowel(s.charAt(j))){
                vowelRight = true;
            } else {
                j--;
            }
            if(vowelLeft && vowelRight){
                char c = arr[i];
                arr[i] = arr[j];
                arr[j] = c;
                vowelLeft = false;
                vowelRight = false;
                i++;
                j--;
            }
        }
        return new String(arr);
    }
}