import java.io.*;
import java.util.*;

public class Main {

    public static void display(int[][] arr) {

        int dir[][] = { { 0, 1 }, { 1, 0 }, { 0, -1 }, { -1, 0 } };
        int d = 0;
        int row = 0;
        int col = 0;
        while (true) {
            if (arr[row][col] == 0) {
                row = row + dir[d][0];
                col = col + dir[d][1];

            } else {
                d++;
                d = d % 4;
                row = row + dir[d][0];
                col = col + dir[d][1];
            }

            if (row < 0) {
                row++;
                break;
            } else if (row == arr.length) {
                row--;
                break;
            } else if (col < 0) {
                col++;
                break;

            } else if (col == arr[0].length) {
                col--;
                break;
            }
        }

        System.out.println(row + "\n" + col);
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] arr = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        display(arr);
    }

}