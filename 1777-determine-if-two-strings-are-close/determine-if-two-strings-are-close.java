class Solution {
    public boolean closeStrings(String word1, String word2) {
        // Map<Character, Integer> map1 = word1.toCharArray().each(ch -> map1.put(ch, map1.getOrDefault(ch, 0) + 1));
        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();

        for (char ch : word1.toCharArray()) {
            map1.put(ch, map1.getOrDefault(ch, 0) + 1);
        }

        for (char ch : word2.toCharArray()) {
            map2.put(ch, map2.getOrDefault(ch, 0) + 1);
        }

        if(!map1.keySet().equals(map2.keySet())) return false;

        List<Integer> list1 = map1.values().stream().sorted().collect(Collectors.toList());
        List<Integer> list2 = map2.values().stream().sorted().collect(Collectors.toList());

        return list1.equals(list2);
    }
}