class Solution {
    public String robotWithString(String s) {
        Stack<Character> stack = new Stack<>();
        StringBuffer sb = new StringBuffer();
        int[] charCount = new int[26];
        for(char c: s.toCharArray()){
            charCount[c-'a']++;
        }

        char minCharacter = 'a';
        for(char c: s.toCharArray()){
            charCount[c-'a']--;
            stack.push(c);
            while (minCharacter != 'z' && charCount[minCharacter - 'a'] == 0) {
                minCharacter++;
            }
            while (!stack.isEmpty() && stack.peek() <= minCharacter) {
                sb.append(stack.pop());
            }
        }

        while(!stack.isEmpty()){
            sb.append(stack.pop());
        }
        return sb.toString();
    }
}