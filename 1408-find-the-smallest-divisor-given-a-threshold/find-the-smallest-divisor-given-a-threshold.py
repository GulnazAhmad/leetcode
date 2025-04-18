class Solution:
    def smallestDivisor(self, nums: List[int], threshold: int) -> int:
        def valid(nums,number,threshold):
            sum=0
            for i in nums:
                sum=sum+ceil(i/number)
            if(sum<=threshold):
                return True
        l=1
        r=max(nums)
        while(l<=r):
            mid=(l+r)//2
            if valid(nums,mid,threshold):
                r=mid-1
            else:
                l=mid+1
        return l

                
        