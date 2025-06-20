class Solution {
    public int maxDistance(String s, int k) {
        int maxDist = 0;
        int hDiff = 0;
        int vDiff = 0;
        int[] arr = new int[4];
        int i = 1;
        for(char c: s.toCharArray()){
            if(c == 'N'){
                arr[0]++;
            } else if (c == 'S') {
                arr[1]++;
            } else if (c == 'E'){
                arr[2]++;
            } else {
                arr[3]++;
            }
            int h = Math.abs(arr[0] - arr[1]);
            int v = Math.abs(arr[2] - arr[3]);
            int cancel = Math.min(arr[0], arr[1]) + Math.min(arr[2], arr[3]);
            int flip = Math.min(k, cancel) * 2;

            maxDist = Math.max(maxDist, h+v+flip);
        }
        return maxDist;
    }
}