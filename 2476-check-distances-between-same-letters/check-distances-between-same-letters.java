class Solution {
    public boolean checkDistances(String s, int[] distance) {
        for(int i=0; i<s.length(); i++){
            int idx = s.charAt(i) - 'a';
            if(distance[idx]<100){
                distance[idx] += 100 * i + 10000;
            } else {
                int offset = distance[idx] - 10000;
                int firstIdx = offset / 100;
                int dist = offset % 100;

                if(i-firstIdx-1 != dist) return false;
            }

        }
        return true;
    }
}