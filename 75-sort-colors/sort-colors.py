class Solution:
    def sortColors(self, nums: List[int]) -> None:
        n=len(nums)
        for i in range(n):
            for j in range(i+1,n):
                if(nums[i]>nums[j]):
                    temp=nums[j]
                    nums[j]=nums[i]
                    nums[i]=temp
        return nums
        """
        
        Do not return anything, modify nums in-place instead.
        """
        