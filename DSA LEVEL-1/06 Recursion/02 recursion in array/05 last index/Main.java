import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int x = sc.nextInt();
        int ans = lastIndex(arr, arr.length - 1, x);
        System.out.println(ans);
    }

    public static int lastIndex(int[] arr, int idx, int x) {
        if (idx < 0) {
            return -1;
        }

        if (arr[idx] == x) {
            return idx;
        }
        int rans = lastIndex(arr, idx - 1, x);

        return rans;

    }

}