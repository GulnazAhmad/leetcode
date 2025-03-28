class Solution:
    def largestOddNumber(self, num: str) -> str:
        #split won't work cause empty sytring not a character we use list
        l=0
        r=0
        n=len(num)
        maxi=""
        while(r<n):
            if(int(num[r])%2!=0):
                maxi=num[:r+1]#since the slicing of large string to integer wa sgiving truble directly remoc=ving it worked instead store maxi as a string rather than integer
                
            r+=1
        if(maxi==0):
            return ""
        return str(maxi)
            



        