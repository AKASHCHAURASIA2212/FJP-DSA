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

    public static void display(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || i == n - 1 || i == j || i + j == n - 1) {
                    System.out.print("*\t");
                } else if (i + j >= n && i > j) {
                    System.out.print("*\t");
                } else {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        display(n);
        // printPattern(n);
    }
}
