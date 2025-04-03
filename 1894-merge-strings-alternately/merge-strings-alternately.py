class Solution:
    def mergeAlternately(self, word1: str, word2: str) -> str:
        l=0
        r=0
        nw1=len(word1)
        nw2=len(word2)

        merged=""

        while(l!=nw1 and r!=nw2):
            merged=merged+word1[l]
            l+=1
            merged=merged+word2[r]
            r+=1
        while(l<nw1):
            merged=merged+word1[l]
            l+=1
        while(r<nw2):
            merged=merged+word2[r]
            r+=1
        return merged

        