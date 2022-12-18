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

        int idx1 = -1;
        int idx2 = -1;
        boolean temp = true;
        for (int i = 0; i < n; i++) {
            if (a[i] == d) {
                if (temp) {
                    idx1 = i;
                    idx2 = i;
                    temp = false;
                } else {
                    idx2 = i;
                }
            }
        }

        System.out.println(idx1);
        System.out.println(idx2);

    }

}