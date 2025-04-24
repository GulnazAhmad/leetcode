class Solution:
    def rotateString(self, s: str, goal: str) -> bool:
        n=len(s)
        for i in range(n):
            s=s[-1]+s[:(n-1)]
            if(s==goal):
                return True
        return False
