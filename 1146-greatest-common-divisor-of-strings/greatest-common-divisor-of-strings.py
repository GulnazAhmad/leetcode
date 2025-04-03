class Solution:
    def gcdOfStrings(self, str1: str, str2: str) -> str:
        l1=0
        r1=1
        l2=0
        r2=1
        nw1=len(str1)
        nw2=len(str2)
        maxi=""
        while(r1<=nw1 or r2<=nw2):
            if(str1[l1:r1]==str2[l2:r2]):
                if(nw1%len(str1[l1:r1])==0 and nw2%len(str2[l2:r2])==0):
                    if (str1[l1:r1]*(nw1//len(str1[l1:r1]))==str1 and str2[l2:r2]*(nw2//len(str1[l2:r2]))==str2):
                        maxi=max(maxi,str1[l1:r1])
            
            r1+=1
            r2+=1
        return maxi

        