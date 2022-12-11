import java.util.*;

public class Main {
    public static void printPattern(int n) {
        int nsp = n / 2;
        int nst = 1;

        for (int row = 1; row <= n; row++) {
            for (int csp = nsp; csp > 0; csp--) {
                System.out.print("\t");
            }

            for (int cst = nst; cst > 0; cst--) {
                System.out.print("*\t");
            }

            System.out.println();

            if (row <= (n / 2)) {
                nsp--;
                nst += 2;
            } else {
                nsp++;
                nst -= 2;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        printPattern(n);

        // *
        // * * *
        // * * * * *
        // * * *
        // *
    }
}