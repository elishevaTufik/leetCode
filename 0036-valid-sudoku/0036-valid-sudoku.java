class Solution {
    
    public boolean isValidSudoku(char[][] board) {
        return isValidRows(board) && isValidCols(board) && isValidBoxes(board);
    }
    
    private boolean isValidRows(char[][] board) {
        for (int i = 0; i < 9; i++) {
            boolean[] seen = new boolean[9];
            for (int j = 0; j < 9; j++) {
                if (board[i][j] != '.') {
                    int num = board[i][j] - '1';
                    if (seen[num]) return false;
                    seen[num] = true;
                }
            }
        }
        return true;
    }
    
    private boolean isValidCols(char[][] board) {
        for (int j = 0; j < 9; j++) {
            boolean[] seen = new boolean[9];
            for (int i = 0; i < 9; i++) {
                if (board[i][j] != '.') {
                    int num = board[i][j] - '1';
                    if (seen[num]) return false;
                    seen[num] = true;
                }
            }
        }
        return true;
    }
    
    private boolean isValidBoxes(char[][] board) {
        for (int boxRow = 0; boxRow < 3; boxRow++) {
            for (int boxCol = 0; boxCol < 3; boxCol++) {
                boolean[] seen = new boolean[9];
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        char numChar = board[boxRow * 3 + i][boxCol * 3 + j];
                        if (numChar != '.') {
                            int num = numChar - '1';
                            if (seen[num]) return false;
                            seen[num] = true;
                        }
                    }
                }
            }
        }
        return true;
    }
}