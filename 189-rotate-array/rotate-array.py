class Solution:
    def rotate(self, nums: List[int], k: int) -> None:
        n=len(nums)
        k=k%n
        x=nums[n-k:]+nums[:n-k]
        for i in range(n):
            nums[i]=x[i]
        return nums