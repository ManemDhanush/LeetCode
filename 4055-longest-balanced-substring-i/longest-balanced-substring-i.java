class Solution {
    public int longestBalanced(String s) {
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            int[] map = new int[26];

            for (int j = i; j < s.length(); j++) {
                map[s.charAt(j) - 'a']++;

                int freq = 0;
                boolean flag = true;

                for (int k = 0; k < 26; k++) {
                    if (map[k] > 0) {
                        if (freq == 0) {
                            freq = map[k];
                        } else if (map[k] != freq) {
                            flag = false;
                            break;
                        }
                    }
                }

                if (flag) {
                    count = Math.max(count, j - i + 1);
                }
            }
        }

        return count;
    }
}
