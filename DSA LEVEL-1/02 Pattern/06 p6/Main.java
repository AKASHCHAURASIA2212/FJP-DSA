import java.util.*;

public class Main {
    public static void printPattern(int n) {
        int nsp = 1;
        int nst = n / 2 + 1;

        for (int row = 1; row <= n; row++) {

            for (int cst = nst; cst > 0; cst--) {
                System.out.print("*\t");
            }

            for (int csp = nsp; csp > 0; csp--) {
                System.out.print("\t");
            }

            for (int cst = nst; cst > 0; cst--) {
                System.out.print("*\t");
            }

            System.out.println();

            if (row <= (n / 2)) {
                nsp += 2;
                nst -= 1;
            } else {
                nsp -= 2;
                nst += 1;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        printPattern(n);

        // * * * * * *
        // * * * *
        // * *
        // * * * *
        // * * * * * *
    }
}