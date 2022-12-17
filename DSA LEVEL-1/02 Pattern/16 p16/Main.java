import java.util.*;

public class Main {
    public static void printPattern(int n) {
        int nsp = 2 * n - 3;
        int nst = 1;
        for (int row = 1; row <= n; row++) {
            int count = 1;
            for (int cst = 1; cst <= nst; cst++) {
                System.out.print(count + "\t");
                count++;
            }

            for (int csp = nsp; csp > 0; csp--) {
                System.out.print("\t");

            }
            if (row == n) {
                System.out.print(count + "\t");
            }
            count--;
            for (int cst = 1; cst <= nst; cst++) {

                System.out.print(count + "\t");
                count--;
            }

            System.out.println();

            nsp -= 2;
            if (row + 1 == n) {
                nst--;
            }
            nst++;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        printPattern(n);
    }
}