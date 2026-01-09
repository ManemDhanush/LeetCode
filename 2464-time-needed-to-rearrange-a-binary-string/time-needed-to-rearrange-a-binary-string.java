class Solution {
    public int secondsToRemoveOccurrences(String s) {
        int count = -1;
        int[] bits = new int [s.length()];
        int len = 0;
        boolean isAns = false;
        boolean isFirst = true;
        for(char c: s.toCharArray()){
            bits[len++] = Character.getNumericValue(c);
        }

        while(!isAns){
            boolean swap = false;
            for(int i=1; i<bits.length; i++){
                if(bits[i-1] == 0 && bits[i] == 1){
                    bits[i-1] = 1;
                    bits[i] = 0;
                    swap = true;
                    i++;
                }
            }

            if(!swap){
                isAns = true;
                // if(isFirst) return count;
            }
            isFirst = false;
            count++;
        }
        // System.out.println(Arrays.toString(bits));
        return count;
    }
}