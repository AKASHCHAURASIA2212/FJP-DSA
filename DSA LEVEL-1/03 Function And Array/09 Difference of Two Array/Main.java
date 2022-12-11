import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner s = new Scanner(System.in);

        int n1 = s.nextInt();
        int a1[] = new int[n1];

        for (int i = 0; i < n1; i++) {

            a1[i] = s.nextInt();
        }

        int n2 = s.nextInt();
        int a2[] = new int[n2];

        for (int i = 0; i < n2; i++) {
            a2[i] = s.nextInt();
        }

        int ans[] = new int[n1 > n2 ? n1 : n2];

        int m = n1 - 1;
        int n = n2 - 1;
        // System.out.println("n1-->"+n1+" n2-->"+n2);
        int k = ans.length - 1;
        // System.out.println("k-->"+k);
        int carry = 0;

        while (n >= 0 || carry > 0) {
            int d2 = a2[n] + carry;

            int d1 = 0;
            if (m >= 0) {
                d1 = a1[m];
            }

            if (d2 < d1) {
                carry = -1;
                d2 = d2 + 10;
            } else {
                carry = 0;
            }

            int val = d2 - d1;
            ans[n] = val;
            n--;
            m--;

        }

        // if(carry>0)
        // {
        // System.out.println(carry);
        // }

        int idx = 0;
        for (int z = 0; z < ans.length; z++) {

            if (ans[z] != 0) {
                idx = z;
                break;
            }

        }

        for (int z = idx; z < ans.length; z++) {

            System.out.println(ans[z]);

        }

    }

}