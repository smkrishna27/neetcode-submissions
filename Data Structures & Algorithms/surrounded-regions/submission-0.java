class Solution {
    public void solve(char[][] board) {
   int rows = board.length, cols = board[0].length;

        // Step 1: Mark border-connected O's
        for (int i = 0; i < rows; i++) {
            dfs(board, i, 0);
            dfs(board, i, cols - 1);
        }
        for (int j = 0; j < cols; j++) {
            dfs(board, 0, j);
            dfs(board, rows - 1, j);
        }

        // Step 2: Flip cells
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (board[i][j] == 'O') board[i][j] = 'X'; // surrounded
                else if (board[i][j] == '#') board[i][j] = 'O'; // safe
            }
        }
    }

    private void dfs(char[][] board, int i, int j) {
        int rows = board.length, cols = board[0].length;
        if (i < 0 || j < 0 || i >= rows || j >= cols || board[i][j] != 'O') return;

        board[i][j] = '#'; // mark safe
        dfs(board, i + 1, j);
        dfs(board, i - 1, j);
        dfs(board, i, j + 1);
        dfs(board, i, j - 1);
    }
}
