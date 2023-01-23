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

    public static int[] solve(int[] arr) {
        // solve
        int[] ans = new int[arr.length];
        Arrays.fill(ans, arr.length);
        Stack<Integer> st = new Stack<>();
        st.push(0);
        for (int i = 1; i < arr.length; i++) {
            int val = arr[i];
            while (st.size() > 0 && val > arr[st.peek()]) {
                ans[st.pop()] = i;
            }
            st.push(i);
        }
        return ans;
    }

    public static void display(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "-");
        }
        System.out.println("\n-------------------------");
    }

    public static void helper(int n, int k, int[] arr) {
        int[] nge = solve(arr);
        // display(nge);
        int j = 0;
        for (int i = 0; i < arr.length - k + 1; i++) {

            j = i;

            while (nge[j] < i + k) {
                j = nge[j];
            }

            System.out.println(arr[j]);

        }
        // System.out.println(arr[j]);

    }

}