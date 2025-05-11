class Solution:
    def maxDepth(self, s: str) -> int:
        parenthesis=0
        maxi=0
        for i in s:
            if i=='(':
                parenthesis+=1
            elif i==')':
                parenthesis-=1
            maxi=max(parenthesis,maxi)

        return maxi
        