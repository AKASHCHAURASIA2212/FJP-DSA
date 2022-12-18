import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int d = sc.nextInt();

        int ceil = Integer.MAX_VALUE;
        int floor = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (a[i] > d && a[i] < ceil) {
                ceil = a[i];
            }

            if (a[i] <= d && a[i] > floor) {
                floor = a[i];
            }
        }

        System.out.println(ceil);
        System.out.println(floor);

    }

}