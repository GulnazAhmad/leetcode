class Solution:
    def missingNumber(self, nums: List[int]) -> int:
        #using set cause searching in set is O(1) but in list directly is O(n).
        num_set=set(nums);
        for i in range(len(nums)):
            if(i not in num_set):
                return i
        
        return i+1
        