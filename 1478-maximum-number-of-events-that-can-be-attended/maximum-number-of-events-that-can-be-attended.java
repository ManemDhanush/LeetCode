import java.util.*;

class Solution {
    public int maxEvents(int[][] events) {
        Arrays.sort(events, (a, b) -> Integer.compare(a[1], b[1]));

        int maxDay = 0;
        for (int[] event : events) {
            maxDay = Math.max(maxDay, event[1]);
        }

        TreeSet<Integer> availableDays = new TreeSet<>();
        for (int i = 1; i <= maxDay; i++) {
            availableDays.add(i);
        }

        int ans = 0;

        for (int[] event : events) {
            Integer day = availableDays.ceiling(event[0]);
            if (day != null && day <= event[1]) {
                availableDays.remove(day);
                ans++;
            }
        }

        return ans;
    }
}
