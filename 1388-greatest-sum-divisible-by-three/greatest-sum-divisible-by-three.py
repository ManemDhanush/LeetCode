class Solution:
    def maxSumDivThree(self, nums: List[int]) -> int:
        min11,min12,min21,min22 = float('inf'),float('inf'),float('inf'),float('inf')
        maxsum = 0
        for num in nums:
            maxsum+=num
            if num%3==1:
                min12 = min(min12,num)
                if min12<min11: min11,min12 = min12,min11
            elif num%3 == 2:
                min22 = min(min22,num)
                if min22<min21: min21,min22 = min22,min21
        
        if maxsum%3==1:
            return max(maxsum-min11,maxsum-min21-min22)
        elif maxsum%3 == 2:
            return max(maxsum-min21,maxsum-min11-min12)
        
        return maxsum
        