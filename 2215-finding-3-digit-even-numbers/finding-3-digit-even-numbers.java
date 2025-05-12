import java.util.ArrayList;
import java.util.HashMap;

class Solution {
    public int[] findEvenNumbers(int[] digits) {
        Set<Integer> ans = new HashSet<>();
        for(int i=0; i<digits.length; i++){
            for(int j=0; j<digits.length; j++){
                for(int k=0; k<digits.length; k++){
                    if(i==j || j==k || k==i){
                        continue;
                    }
                    // int temp = (i*100) + (j*10) + k;
                    if(digits[k]%2 == 0 && digits[i]!=0){
                        ans.add((digits[i]*100) + (digits[j]*10) + digits[k]);
                    }
                }
            }
        }

        return ans.stream().mapToInt(Integer::valueOf).sorted().toArray();
    }
}
