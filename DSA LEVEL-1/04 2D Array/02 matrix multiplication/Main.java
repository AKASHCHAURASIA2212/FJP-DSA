import java.io.*;
import java.util.*;

public class Main {

    public static void display(int[][] arr) {
        int n = arr.length;
        int m = arr[0].length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] multiply(int[][] arr1, int[][] arr2) {
        int n1 = arr1.length;
        int m1 = arr1[0].length;
        int n2 = arr2.length;
        int m2 = arr2[0].length;

        int[][] prod = new int[n1][m2];

        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < m2; j++) {
                int ans = 0;
                for (int k = 0; k < m1; k++) {
                    ans += arr1[i][k] * arr2[k][j];
                }
                prod[i][j] = ans;
            }
        }

        return prod;

    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int m1 = sc.nextInt();

        int[][] arr1 = new int[n1][m1];

        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < m1; j++) {
                arr1[i][j] = sc.nextInt();
            }
        }

        int n2 = sc.nextInt();
        int m2 = sc.nextInt();

        int[][] arr2 = new int[n2][m2];

        for (int i = 0; i < n2; i++) {
            for (int j = 0; j < m2; j++) {
                arr2[i][j] = sc.nextInt();
            }
        }

        if (m1 != n2) {
            System.out.println("Invalid input");
            return;
        }

        int[][] ans = multiply(arr1, arr2);

        display(ans);
    }

}