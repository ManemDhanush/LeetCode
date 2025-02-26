class Solution {
    HashMap<String, Integer> dp = new HashMap<>();
    public int numDecodings(String s) {
        return memo(s, "");
    }

    public int memo(String s, String curr) {
        if (s.isEmpty()) return 1;
        if (dp.containsKey(s)) return dp.get(s);
        int ways = 0;
        if (s.charAt(0) != '0') {
            ways += memo(s.substring(1), s.substring(0, 1));
        }

        if (s.length() > 1) {
            int num = Integer.parseInt(s.substring(0, 2));
            if (num >= 10 && num <= 26) {
                ways += memo(s.substring(2), s.substring(0, 2));
            }
        }

        dp.put(s, ways);
        return ways;

    }
}