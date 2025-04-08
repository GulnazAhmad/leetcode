class Solution:
    def majorityElement(self, nums: List[int]) -> int:
        maps={}
        n=len(nums)
        for i in nums:
            if(i in maps):
                maps[i]+=1
            else:
                maps[i]=1
        maxi=0
        
        for key,value in maps.items():
            maxi=max(maxi,value) 
        for key,value in maps.items():
            if(maxi==value):
                return key 
        