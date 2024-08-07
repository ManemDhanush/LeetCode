class Solution {
    public boolean increasingTriplet(int[] nums) {
        // return false;
        // for(int i=0; i<nums.length; i++){
        //     for(int j=i+1; j<nums.length; j++){
        //         if(nums[i] < nums[j]){
        //             for(int k=j+1; k<nums.length; k++){
        //                 // System.out.println("i="+i+" j="+j+" k="+k);
        //                 // if(nums[i] == '1' || )
        //                 if(k>20){
        //                     return false;
        //                 }
        //                 if(nums[j] < nums[k]){
        //                     return true;
        //                 }
        //             }
        //         }
        //     }
        // }
        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;
        for(int n: nums){
            if(n <= first){
                first = n;
            } else if (n <= second){
                second = n;
            } else {
                return true;
            }
        }
        return false;
    }
}