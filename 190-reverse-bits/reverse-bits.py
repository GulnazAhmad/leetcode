class Solution:
    def reverseBits(self, n: int) -> int:

        arr=[0]*32
        i=0
        while(n>0):
            rem=n%2
            arr[i]=rem
            n=n//2
            i+=1
        string="".join(map(str,arr))
        return int(string,2)
        