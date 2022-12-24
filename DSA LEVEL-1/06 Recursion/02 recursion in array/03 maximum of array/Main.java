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
        int ans = maxOfArray(arr, 0);
        System.out.println(ans);
    }

    public static int maxOfArray(int[] arr, int idx) {
        if (idx == arr.length) {
            return 0;
        }

        int rans = maxOfArray(arr, idx + 1);
        if (arr[idx] > rans) {
            return arr[idx];
        }
        return rans;

    }

}