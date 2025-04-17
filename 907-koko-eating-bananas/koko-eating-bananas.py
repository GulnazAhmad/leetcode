class Solution:
    def minEatingSpeed(self, piles: List[int], h: int) -> int:
        def canfinish(k,h):
            totalh=0
            for i in piles:
                
                if(i<k):
                    totalh+=1
                elif(i>=k):
                    totalh+=ceil(i/k)
            if(totalh<=h):
                return True
        l=1
        r=max(piles)
        while(l<r):
            mid=(l+r)//2
            if(canfinish(mid,h)):
                r=mid
            else:
                l=mid+1
        return l


        
        
       
     
          
     


