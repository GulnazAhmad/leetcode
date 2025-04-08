class Solution:
    def majorityElement(self, nums: List[int]) -> int:
        maps={}
        n=len(nums)
        for i in nums:
            if(i in maps):
                maps[i]+=1
            else:
                maps[i]=1
        #maxkey=0
        #maxvalue=0
        maxkey = max(maps, key=maps.get) #looping through keys getting their vaue storing what is maximum

        
        return maxkey
        