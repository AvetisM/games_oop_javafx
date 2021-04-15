package ru.job4j.puzzle;

public class Win {
    public static boolean check(int[][] board) {
        boolean rsl = false;
        for (int i = 0; i < board.length; i++) {
            if (board[i][i] == 1) {
                if (checkVertical(board, i) || checkHorizontal(board, i)) {
                    rsl = true;
                    break;
                }
            }
        }
        return rsl;
    }

    public static boolean checkVertical(int[][] board, int colomn) {
        boolean rsl = true;
        for (int row = 0; row < board.length; row++) {
            if (board[row][colomn] != 1) {
                rsl = false;
                break;
            }
        }
        return rsl;
    }

    public static boolean checkHorizontal(int[][] board, int row) {
        boolean rsl = true;
        for (int colomn = 0; colomn < board.length; colomn++) {
            if (board[row][colomn] != 1) {
                rsl = false;
                break;
            }
        }
        return rsl;
    }
}

