class Solution:
    def rearrangeArray(self, nums: List[int]) -> List[int]: 
        
        m=0
        n=1
        l=len(nums)
        ans=[0]*l
        for i in range(len(nums)):
            if(nums[i]>0 and m<l):
                ans[m]=nums[i]
                m+=2
            elif(nums[i]<0 and n<l):
                ans[n]=nums[i]
                n+=2
        return ans

        