class Solution {
    private void dfs(int r ,int c,char[][] board,int[][] visited){
        int n=board.length;
        int m=board[0].length;
        visited[r][c]=1;
        int [] delrow={-1,0,+1,0};
        int [] delcol={0,+1,0,-1};
        for(int i=0;i<4;i++){ //4 directions
            int nrow=r+delrow[i];
            int ncol=c+delcol[i];
            if(nrow>0 && nrow<n && ncol>0 && ncol<m && visited[nrow][ncol]==0 && board[nrow][ncol]=='O'){
                dfs(nrow,ncol,board,visited);
            }
          
        }

    }

    public void solve(char[][] board) {
        //checking boundaries of board
        int n=board.length;
        int m=board[0].length;
        int [][] visited=new int[n][m];//initialising every visted matrix to 0
        for (int j=0;j<m;j++){
            //first row
            if(board[0][j]=='O' && visited[0][j]==0){
                dfs(0,j,board,visited);
            }
            //last row
             if(board[n-1][j]=='O' && visited[n-1][j]==0){
                dfs(n-1,j,board,visited);
            }
        }
        for (int i=0;i<n;i++){
            //first row
            if(board[i][0]=='O' && visited[i][0]==0){
                dfs(i,0,board,visited);
            }
            //last row
             if(board[i][m-1]=='O' && visited[i][m-1]==0){
                dfs(i,m-1,board,visited);
            }
        }
        //whatever rest is not at boundary or related tp bpundary mark them ad X
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(visited[i][j]==0 && board[i][j]=='O'){
                    board[i][j]='X';
                }
            }
        }
        //return board;
        
    }
}