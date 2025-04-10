class Solution:
    def rotate(self, matrix: List[List[int]]) -> None:
        """
        Do not return anything, modify matrix in-place instead.
        """
        m=len(matrix)
        for i in range(m):
            for j in range(i+1,m):
                if(i!=j):
                    temp=matrix[i][j]
                    matrix[i][j]=matrix[j][i]
                    matrix[j][i]=temp
        print(matrix)
        for i in range(m):
            x=matrix[i][::-1]
            matrix[i]=x

        