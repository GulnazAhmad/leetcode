class Solution:
    def gcdOfStrings(self, str1: str, str2: str) -> str:
        l,r=0,1
        
        
        nw1,nw2=len(str1),len(str2)
        
        maxi=""
        #x=min(nw1,nw2)
        while(r<=nw1 or r<=nw2):
            if str1[l:r] == str2[l:r]:  # Check if substrings match
                f=str1[l:r]
                if(nw1%len(f)==0 and nw2%len(f)==0):
                    if (f * (nw1 // len(f)) == str1 and f * (nw2 // len(f)) == str2):
                        maxi=max(maxi,f)
            
            r+=1
        return maxi

        