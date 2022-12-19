import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {

        Scanner s = new Scanner(System.in);
        int m = s.nextInt();
        int n = s.nextInt();

        int arr[][] = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = s.nextInt();
            }
        }
        int count = 1;
        int dip = m * n;

        int minr = 0;
        int maxr = m - 1;
        int minc = 0;
        int maxc = n - 1;

        while (count <= dip) {
            for (int i = minr; i <= maxr && count <= dip; i++) {
                System.out.println(arr[i][minc]);
                count++;
            }
            minc++;

            for (int i = minc; i <= maxc && count <= dip; i++) {
                System.out.println(arr[maxr][i]);
                count++;
            }
            maxr--;

            for (int i = maxr; i >= minr && count <= dip; i--) {
                System.out.println(arr[i][maxc]);
                count++;
            }
            maxc--;

            for (int i = maxc; i >= minc && count <= dip; i--) {
                System.out.println(arr[minr][i]);
                count++;
            }
            minr++;
        }

    }

}