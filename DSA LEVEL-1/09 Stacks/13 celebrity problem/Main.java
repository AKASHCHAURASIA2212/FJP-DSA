import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][n];

        for (int j = 0; j < n; j++) {
            String line = br.readLine();
            for (int k = 0; k < n; k++) {
                arr[j][k] = line.charAt(k) - '0';
            }
        }

        findCelebrity(arr);

    }

    public static void findCelebrity(int[][] arr) {
        // if a celebrity is there print it's index (not position), if there is not then
        // print "none"
        int n = arr[0].length;
        int[] vis = new int[arr[0].length];
        for (int j = 0; j < n; j++) {
            for (int k = 0; k < n; k++) {
                if (arr[j][k] == 1) {
                    vis[j]--;
                    vis[k]++;
                }
            }
        }
        int max = Integer.MIN_VALUE;
        int idx = -1;
        for (int i = 0; i < n; i++) {
            if (vis[i] > max) {
                max = vis[i];
                idx = i;
            }

        }
        for (int i = 0; i < n; i++) {
            if (arr[idx][i] == 1) {
                System.out.println("none");
                return;
            }
        }
        System.out.println(idx);
    }

}