class Solution {
    public void solve(char[][] board) {
        // dfs(board, 0,0,false, false, false, false);
        // for(int i=0; i<board.length; i++){
        //     for(int j=0; j< board[0].length; j++){
        //         if(board[i][j] == 'O'){
        //             dfs(board, i, j);
        //         }
        //     }
        // }

        for (int i = 0; i < board[0].length; i++) {
            if (board[0][i] == 'O') dfs(board, 0, i);
            if (board[board.length - 1][i] == 'O') dfs(board, board.length - 1, i);
        }

        for (int j = 0; j < board.length; j++) {
            if (board[j][0] == 'O') dfs(board, j, 0);
            if (board[j][board[0].length - 1] == 'O') dfs(board, j, board[0].length - 1);
        }

        for(int i=0; i<board.length; i++){
            for(int j=0; j< board[0].length; j++){
                if(board[i][j] == 'O'){
                    board[i][j] = 'X';
                }
            }
        }

        for(int i=0; i<board.length; i++){
            for(int j=0; j< board[0].length; j++){
                if(board[i][j] == 'U'){
                    board[i][j] = 'O';
                }
            }
        }
    }


    public void dfs(char[][] board, int i, int j){
        if(i < 0 || j < 0 || i >= board.length || j >= board[0].length || board[i][j] != 'O') return;

        // if(board[i][j] == 'O') board[i][j] = 'X';
        board[i][j] = 'U';

        
        dfs(board, i+1, j);
        dfs(board, i, j+1);
        dfs(board, i-1, j);
        dfs(board, i, j-1);
    }
}