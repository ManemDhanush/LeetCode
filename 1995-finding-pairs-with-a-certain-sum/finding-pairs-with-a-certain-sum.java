class FindSumPairs {

    int[] num1; 
    int[] num2; 
    HashMap<Integer, Integer> map;

    public FindSumPairs(int[] nums1, int[] nums2) {
        this.num1 = nums1.clone();
        this.num2 = nums2.clone();
        this.map = new HashMap<>();
        for(int num: num2){
            map.put(num, map.getOrDefault(num, 0)+1);
        }
    }
    
    public void add(int index, int val) {
        int old = num2[index];
        map.put(old, map.get(old) - 1);
        num2[index] += val;
        map.put(num2[index], map.getOrDefault(num2[index], 0) + 1);
    }
    
    public int count(int tot) {
        int ans = 0;
        for(int i=0; i<num1.length; i++){
            ans += map.getOrDefault(tot - num1[i], 0);
        }

        return ans;
    }
}

/**
 * Your FindSumPairs object will be instantiated and called as such:
 * FindSumPairs obj = new FindSumPairs(nums1, nums2);
 * obj.add(index,val);
 * int param_2 = obj.count(tot);
 */