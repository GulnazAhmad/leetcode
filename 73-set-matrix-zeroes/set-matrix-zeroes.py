class Solution:
    def setZeroes(self, matrix: List[List[int]]) -> None:
        """
        Do not return anything, modify matrix in-place instead.
        """
        m=len(matrix)
        n=len(matrix[0])
        listi=[]
        #listj=[]
        for i in range(m):
            for j in range(n):
                if(matrix[i][j]==0):
                    listi.append(i)
                    listi.append(j)
        i=0
        j=1
        
        while j<len(listi):
            x=0
            while(x<n):
                matrix[listi[i]][x]=0
                x+=1
            x=0
            while(x<m):
                matrix[x][listi[j]]=0
                x+=1
            i+=2
            j+=2


        