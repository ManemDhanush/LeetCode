class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";

        int ans = 1;

        while (true) {
            char t = 0;

            for (String str : strs) {

                if (str.length() < ans)
                    return strs[0].substring(0, ans - 1);

                if (t == 0)
                    t = str.charAt(ans - 1);

                if (str.charAt(ans - 1) != t)
                    return strs[0].substring(0, ans - 1);
            }

            ans++;
        }
    }
}
