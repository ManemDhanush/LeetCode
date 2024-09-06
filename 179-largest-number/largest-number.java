class Solution {
    public String largestNumber(int[] nums) {
        String numStrings = Arrays
                                .stream(nums)
                                .boxed()
                                .map(x -> x.toString())
                                .sorted((a,b) -> (b+a).compareTo(a+b))
                                .reduce("", (x, y) -> x + y);

        // System.out.println(numStrings);

        int i = 0;
        while (i < numStrings.length() - 1 && numStrings.charAt(i) == '0')
            i++;

        if (i != 0)
            return numStrings.substring(i);


        return numStrings;
    }
}