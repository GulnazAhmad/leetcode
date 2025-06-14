class Solution:
    def generate(self, numRows: int) -> List[List[int]]:
        def rCc(r,c):
            res=1
            for i in range(c):
                res=res*(r-i)
                res=res//(i+1)
            return res
        arr=[]
        for row in range(numRows):
            temp=[]
            for relement in range(row+1):
                temp.append(rCc(row,relement))
            arr.append(temp)
        return arr


        