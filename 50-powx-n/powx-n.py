class Solution:
    def myPow(self, x: float, n: int) -> float:
        if(n>0):
            return round(x**n,5)
        elif(n<0):
            return round((1/x)**-n,5)
        elif(n==0):
            return round(1,5)
        elif(x==0):
            return round(0,5)
    