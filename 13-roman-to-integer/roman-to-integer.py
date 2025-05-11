class Solution:
    def romanToInt(self, s: str) -> int:
        r=s[::-1]
        print(r)
        roman={
            'I':1,
            'V':5,
            'X':10,
            'L':50,
            'C':100,
            'D':500,
            'M':1000
        }
        total=0
        left=0

        for i in r:
            value=roman[i] #1,5,10,100,500
            if left>value:
                total-=value
            else:
                total+=value
                left=value
        return total


        