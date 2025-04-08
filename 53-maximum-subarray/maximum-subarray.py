class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        n=len(nums)
        max_sum=float('-inf')
        sums=0
        for i in range(n):
            sums=sums+nums[i]
            max_sum=max(max_sum,sums) 
            if(sums<0):
                sums=0  
        return max_sum    

            




        