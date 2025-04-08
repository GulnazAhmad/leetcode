class Solution:
    def majorityElement(self, nums: List[int]) -> int:
        maps={}
        n=len(nums)
        for i in nums:
            if(i in maps):
                maps[i]+=1
            else:
                maps[i]=1
        maxkey=0
        maxvalue=0
        for key,value in maps.items():
            if(value>maxvalue):
                maxvalue=value
                maxkey=key
        return maxkey
        