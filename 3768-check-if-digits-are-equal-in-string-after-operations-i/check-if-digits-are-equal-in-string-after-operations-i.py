class Solution:
    def hasSameDigits(self, s: str) -> bool:
    
        while(len(s)!=2):
            m=""
            for i in range(len(s)-1):
                d=(int(s[i])+int(s[i+1]))%10
                m+=str(d)
            s=m
        if(len(s)==2):
            if(s[0]==s[1]):
                return True
        return False
        
        
        

        