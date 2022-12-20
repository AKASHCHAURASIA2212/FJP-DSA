import java.io.*;
import java.util.*;

public class Main {

    public static void rotate(int[][] arr) {
        int n = arr.length;

        for (int row = 0; row < n - 1; row++) {

            for (int col = row + 1; col <= n - 1; col++) {
                int temp = arr[row][col];
                arr[row][col] = arr[col][row];
                arr[col][row] = temp;
            }
        }
        // display(arr);

        // re-arrange array

        for (int i = 0; i < n; i++) {
            int lo = 0, hi = n - 1;
            while (lo < hi) {
                int temp = arr[i][lo];
                arr[i][lo] = arr[i][hi];
                arr[i][hi] = temp;
                lo++;
                hi--;
            }
        }
    }

    public static void display(int[][] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
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

        rotate(arr);
        display(arr);
    }

}