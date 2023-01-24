import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][2];

        for (int j = 0; j < n; j++) {
            String line = br.readLine();
            arr[j][0] = Integer.parseInt(line.split(" ")[0]);
            arr[j][1] = Integer.parseInt(line.split(" ")[1]);
        }

        mergeOverlappingIntervals(arr);
    }

    public static void mergeOverlappingIntervals(int[][] arr) {
        Pair[] mypair = new Pair[arr.length];

        for (int i = 0; i < arr.length; i++) {
            mypair[i] = new Pair(arr[i][0], arr[i][1]);
        }
        Arrays.sort(mypair);
        Stack<Pair> st = new Stack<>();

        for (int i = 0; i < mypair.length; i++) {
            if (i == 0) {
                st.push(mypair[i]);
            } else {
                Pair top = st.peek();
                if (mypair[i].st <= top.et) {

                    top.et = (int) Math.max(top.et, mypair[i].et);

                } else {
                    st.push(mypair[i]);

                }
            }
        }
        Stack<Pair> ans = new Stack<>();
        while (st.size() > 0) {
            ans.push(st.pop());
        }

        while (ans.size() > 0) {
            Pair rem = ans.pop();
            System.out.println(rem.st + " " + rem.et);
        }
    }

    static public class Pair implements Comparable<Pair> {
        int st, et;

        Pair(int st, int et) {
            this.st = st;
            this.et = et;
        }

        // this>other return +ve
        // this=other return 0
        // this<other return -ve
        public int compareTo(Pair other) {
            if (this.st != other.st) {
                return this.st - other.st;
            } else {
                return this.et - other.et;
            }
        }
    }

}