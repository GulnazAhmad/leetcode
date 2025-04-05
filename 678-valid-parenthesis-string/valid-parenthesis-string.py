class Solution:
    def checkValidString(self, s: str) -> bool:
        min=0
        max=0
        for i in s:
            if i=='(':
                min=min+1
                max=max+1
            elif i==')':
                min=min-1
                max=max-1
            else:
                min=min-1
                max=max+1
            if(min<0):
                min=0
            #max can never be negative i can take it down min if it is negative but max's -ve can't be taken down
            if(max<0):
                return False
        if(min==0 or max==0):
            return True
        return False
                
        