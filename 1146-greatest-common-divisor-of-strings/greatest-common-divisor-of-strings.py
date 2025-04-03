class Solution:
    def gcdOfStrings(self, str1: str, str2: str) -> str:
        l,r=0,1
        
        
        nw1,nw2=len(str1),len(str2)
        
        maxi=""
        x=min(nw1,nw2)
        while(r<=x):
            if str1[l:r] == str2[l:r]:  # Check if substrings match

                if(nw1%len(str1[l:r])==0 and nw2%len(str2[l:r])==0):
                    if (str1[l:r] * (nw1 // len(str1[l:r])) == str1 and str2[l:r] * (nw2 // len(str2[l:r])) == str2):
                        maxi=max(maxi,str1[l:r])
            
            r+=1
        return maxi

        