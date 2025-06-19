class Solution:
    def nextPermutation(self, nums: List[int]) -> None:
        l=len(nums)
        index=-1
        for i in range(l-2,-1,-1):
            if(nums[i]<nums[i+1]):
                index=i
                print("i am inside",i)
                break
        for i in range (l-1,index,-1):
            if(nums[i]>nums[index]):       
                nums[index],nums[i]=nums[i],nums[index]
                break
            print(nums)
        nums[index+1:] = reversed(nums[index+1:]) 

        if(index==-1):
            nums.sort()


        """
        Do not return anything, modify nums in-place instead.
        """
        