class Solution:
    def shipWithinDays(self, weights: List[int], days: int) -> int:
        def valid(weights,capacity,days):
            sum=0
            tday=1
            for i in weights:
                if(sum+i<=capacity):
                    sum=sum+i
                else:
                    sum=i
                    tday+=1
            print("day",tday+1)
            print(sum)
            if(tday<=days):
                return True
            else:
                return False
            

        l=max(weights)
        r=sum(weights)
        while(l<=r):
            mid=(l+r)//2
            print("capacity",mid)
            if valid(weights,mid,days):
                r=mid-1
            else:
                l=mid+1
        return l   