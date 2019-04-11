package com.abhijit.backtracking;

public class NQueensProblem {

    private static int N = 4;

    private static void buildEmptyBoard(int[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                board[i][j] = 0;
            }
        }
    }

    private static void solveNQueenBacktracking(int[][] board) {
        if (!solveNQueenUtil(board, 0)) {
            System.out.println("Solution doesn't exist");
        } else {
            System.out.println("NQueens solution");
            printBoard(board);
        }
    }

    private static boolean solveNQueenUtil(int[][] board, int col) {
        if (col >= N) {
            return true;
        }
        for(int i = 0; i < N; i++) {
            if (boundingFunction(board, i, col)) {
                board[i][col] = 1;
                if (solveNQueenUtil(board, col + 1)) {
                    return true;
                }
                board[i][col] = 0;
            }
        }
        return false;
    }

    private static boolean boundingFunction(int[][] board, int row, int col) {
        int i, j;

        // Check the row on the left side
        for (j = 0; j < col; j++) {
            if (board[row][j] == 1) {
                return false;
            }
        }

        // Check upper diagonal on left side
        for (i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 1) {
                return false;
            }
        }

        // Check lower diagonal on left side
        for (i = row, j = col; i < N && j >= 0; i++, j--) {
            if (board[i][j] == 1) {
                return false;
            }
        }

        return true;
    }

    private static void printBoard(int[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j]);
                System.out.print("\t");
            }
            System.out.print("\n");
        }
    }

    public static void main(String[] args) {
        int[][] board = new int[N][N];
        buildEmptyBoard(board);
        solveNQueenBacktracking(board);
    }

}
