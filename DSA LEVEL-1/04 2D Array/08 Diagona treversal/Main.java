import java.io.*;
import java.util.*;

public class Main {

    public static void display(int[][] arr) {
        int n = arr.length;

        for (int j = 0; j < n; j++) {
            int row = 0;
            int col = j;

            while (row < n && col < n) {
                System.out.println(arr[row][col]);
                row = row + 1;
                col = col + 1;
            }
        }
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[][] arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        display(arr);
    }

}