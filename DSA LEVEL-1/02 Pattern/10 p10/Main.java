import java.util.*;

public class Main {
    public static void printPattern(int n) {
        int nsp1 = n / 2;
        int nst1 = 1;
        int nsp2 = -1;
        int nst2 = 0;

        for (int row = 1; row <= n; row++) {
            // first space
            for (int csp = nsp1; csp > 0; csp--) {
                System.out.print("\t");
            }

            // first star
            for (int cst = nst1; cst > 0; cst--) {
                System.out.print("*\t");
            }

            // second space
            for (int csp = nsp2; csp > 0; csp--) {
                System.out.print("\t");
            }

            // second star
            for (int cst = nst2; cst > 0; cst--) {
                System.out.print("*\t");
            }

            System.out.println();

            if (row <= n / 2) {
                nsp1--;
                nst2 = 1;
                nsp2 += 2;
            } else {
                nsp1++;
                nsp2 -= 2;
                if (row + 1 == n) {
                    nst2 = 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        printPattern(n);
    }
}