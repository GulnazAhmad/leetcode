class Solution:
    def searchRange(self, nums: List[int], target: int) -> List[int]:
        count=0
        listi=[]
        for i in range(len(nums)):
            if nums[i]==target:
                count+=1
                listi.append(i)
        if(len(listi)>0):
            return [listi[0],listi[-1]]
        return[-1,-1]
        