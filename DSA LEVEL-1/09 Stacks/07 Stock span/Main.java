import java.io.*;
import java.util.*;

public class Main {
    public static void display(int[] a) {
        StringBuilder sb = new StringBuilder();

        for (int val : a) {
            sb.append(val + "\n");
        }
        System.out.println(sb);
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(br.readLine());
        }

        int[] span = solve(a);
        display(span);
    }

    public static int[] solve(int[] arr) {
        int[] ngol = nextGreaterElementOnLeft(arr);
        int[] ans = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            if (ngol[i] == -1) {
                ans[i] = i + 1;
            } else if (arr[ngol[i]] > arr[i]) {
                ans[i] = i - ngol[i];
            }
        }
        return ans;
    }

    public static int[] nextGreaterElementOnLeft(int[] arr) {

        Stack<Integer> st = new Stack<>();

        int[] ans = new int[arr.length];

        Arrays.fill(ans, -1);

        for (int i = arr.length - 1; i >= 0; i--) {

            while (st.size() > 0 && arr[st.peek()] < arr[i]) {
                ans[st.pop()] = i;
            }
            st.push(i);
        }
        return ans;
    }

}