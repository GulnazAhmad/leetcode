class Solution:
    def mergeAlternately(self, word1: str, word2: str) -> str:
        i=0
        res=[]
        nw1=len(word1)
        nw2=len(word2)
        while(i<nw1 or i<nw2):
            if(i<nw1):
                res.append(word1[i])
                
            if(i<nw2):
                res.append(word2[i])
            i+=1
        return "".join(res)
