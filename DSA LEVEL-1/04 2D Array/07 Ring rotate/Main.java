import java.io.*;
import java.util.*;

public class Main {

    public static int[] toExtractArrFromRing(int[][] arr, int s) {
        int m = arr.length, n = arr[0].length;
        int maxr = m - s;
        int minr = s - 1;
        int maxc = n - s;
        int minc = s - 1;
        // System.out.println(((maxr-minr)+(maxc-minc))*2);

        int count = ((maxr - minr) + (maxc - minc)) * 2;
        int[] myarr = new int[count];
        int temp = 0;

        int k = 0;
        // System.out.println();

        while (temp < count) {

            // minrow
            for (int i = minc; i <= maxc; i++) {
                // System.out.println(k);
                myarr[k] = arr[minr][i];
                k++;

                temp++;
            }
            minr++;

            // maxcol
            for (int i = minr; i <= maxr; i++) {
                // System.out.println(k);
                myarr[k] = arr[i][maxc];
                k++;

                temp++;
            }
            maxc--;

            // maxrow
            for (int i = maxc; i >= minc; i--) {
                myarr[k] = arr[maxr][i];
                k++;
                temp++;
            }
            maxr--;

            // minrow
            for (int i = maxr; i >= minr; i--) {
                myarr[k] = arr[i][minc];
                k++;
                temp++;
            }
            minc++;
        }
        // for(int i=0;i<count;i++){
        // System.out.print(myarr[i]+" ");
        // }
        return myarr;
        // return new int[2];

    }

    public static void rotate(int[] arr, int lo, int hi) {
        while (lo < hi) {
            int temp = arr[lo];
            arr[lo] = arr[hi];
            arr[hi] = temp;
            lo++;
            hi--;
        }
    }

    public static int[] rotateArr(int[] arr, int k) {
        int len = arr.length;
        k = k % len;
        if (k < 0) {
            k = k + len;
        }
        // System.out.println();
        rotate(arr, 0, k - 1);
        rotate(arr, k, len - 1);
        rotate(arr, 0, len - 1);

        // for(int i=0;i<len;i++){
        // System.out.print(arr[i]+" ");
        // }
        return arr;
    }

    public static void toInsertArrIntoRing(int[] fill, int s, int[][] arr) {
        int m = arr.length, n = arr[0].length;
        int maxr = m - s;
        int minr = s - 1;
        int maxc = n - s;
        int minc = s - 1;
        // System.out.println(((maxr-minr)+(maxc-minc))*2);

        int count = ((maxr - minr) + (maxc - minc)) * 2;
        int temp = 0;

        int k = 0;
        // System.out.println();

        while (temp < count) {

            // minrow
            for (int i = minc; i <= maxc; i++) {
                // System.out.println(k);
                arr[minr][i] = fill[k];
                k++;

                temp++;
            }
            minr++;

            // maxcol
            for (int i = minr; i <= maxr; i++) {
                // System.out.println(k);
                arr[i][maxc] = fill[k];
                k++;

                temp++;
            }
            maxc--;

            // maxrow
            for (int i = maxc; i >= minc; i--) {
                arr[maxr][i] = fill[k];
                k++;
                temp++;
            }
            maxr--;

            // minrow
            for (int i = maxr; i >= minr; i--) {
                arr[i][minc] = fill[k];
                k++;
                temp++;
            }
            minc++;
        }

    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] arr = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int s = sc.nextInt();
        int r = sc.nextInt();

        int[] sarr = toExtractArrFromRing(arr, s);
        int[] rarr = rotateArr(sarr, r);
        toInsertArrIntoRing(rarr, s, arr);
        display(arr);

    }

    public static void display(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

}