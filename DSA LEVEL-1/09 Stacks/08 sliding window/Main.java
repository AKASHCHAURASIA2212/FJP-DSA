import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(br.readLine());
        }
        int k = Integer.parseInt(br.readLine());

        // code
        helper(n, k, a);
    }

    public static void helper(int n, int k, int[] arr) {
        Queue<Integer> qu1 = new LinkedList<>();
        Queue<Integer> qu2 = new LinkedList<>();
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {

            if (i < k) {
                if (arr[i] > max) {
                    max = arr[i];

                }
                qu1.add(arr[i]);
            } else {
                System.out.println(max);
                int val = qu1.remove();
                qu1.add(arr[i]);
                if (max == val || arr[i] > max) {
                    max = findMax(qu1, qu2);
                }
            }
        }
        System.out.println(max);
    }

    public static int findMax(Queue<Integer> qu1, Queue<Integer> qu2) {
        int max = Integer.MIN_VALUE;
        while (qu1.size() != 0) {
            int val = qu1.remove();
            if (val > max) {
                max = val;
            }
            qu2.add(val);
        }

        while (qu2.size() != 0) {
            qu1.add(qu2.remove());
        }

        return max;
    }
}