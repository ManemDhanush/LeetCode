import java.util.ArrayList;
import java.util.HashMap;

class Solution {
    public int[] findEvenNumbers(int[] digits) {
        ArrayList<Integer> ans = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int digit : digits) {
            map.put(digit, map.getOrDefault(digit, 0) + 1);
        }

        for (int num = 100; num <= 998; num += 2) { 
            int hundreds = num / 100;
            int tens = (num / 10) % 10;
            int ones = num % 10;

            HashMap<Integer, Integer> tempMap = new HashMap<>(map);
            if (tempMap.getOrDefault(hundreds, 0) > 0) {
                tempMap.put(hundreds, tempMap.get(hundreds) - 1);
                if (tempMap.getOrDefault(tens, 0) > 0) {
                    tempMap.put(tens, tempMap.get(tens) - 1);
                    if (tempMap.getOrDefault(ones, 0) > 0) {
                        ans.add(num);
                    }
                }
            }
        }

        return ans.stream().mapToInt(Integer::valueOf).toArray();
    }
}
