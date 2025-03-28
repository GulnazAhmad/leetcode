class Solution:
    def reverseWords(self, s: str) -> str:
        new=s.split()
        n=len(new)
        l=0
        r=len(new)-1
        while(l<r and r<n):
            temp=new[l]
            new[l]=new[r]
            new[r]=temp
            l+=1
            r-=1
        return " ".join(new)
              


        