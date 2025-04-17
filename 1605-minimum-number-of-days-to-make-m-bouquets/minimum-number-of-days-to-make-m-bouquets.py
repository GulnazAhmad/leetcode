class Solution:
    def minDays(self, bloomDay: List[int], m: int, k: int) -> int:
        def possible(bloomDay,m,k,day):
            nm=0
            counter=0
            for j in range(n):#(0-5)
                if bloomDay[j]<=day: #victort
                    counter+=1
                    if(counter==k):
                        nm+=1
                        counter=0
                else:
                     #for counter number of bouques from adjacent flowers
                    counter=0
            if(nm>=m):
                return True
        f=m*k
        n=len(bloomDay)
         #(number of flowers boques that can be made)
        #counter=0
        #if no of flowers neede is more than no of flowers present
        if(f>n):
            return -1 #victory
        l=min(bloomDay)
        r=max(bloomDay)
        ans=r
        while(l<=r):
            mid=(l+r)//2

            if (possible(bloomDay,m,k,mid)==True):
                ans=mid
                r=mid-1 #since we have to find minimum so all the days above it must satisfy so we will try finding below it
            else:
                l=mid+1
        return l
        

        




                

        