import java.util.*;

public class Main {
    public static void fill(int[][] board) {
        int n = board.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j == 0) {
                    board[i][j] = 1;
                }

                if (i != 0 && j != 0) {
                    board[i][j] = board[i - 1][j - 1] + board[i - 1][j];
                }
            }
        }
    }

    public static void display(int[][] board) {
        int n = board.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] != 0) {
                    System.out.print(board[i][j] + "\t");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] board = new int[n][n];
        fill(board);
        display(board);
        // printPattern(n);
    }
}
