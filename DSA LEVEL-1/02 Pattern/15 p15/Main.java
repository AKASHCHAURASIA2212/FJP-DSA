import java.util.*;

public class Main {
    public static void printPattern(int n) {
        int nsp = n / 2;
        int nst = 1;
        int count = 1;
        int prev = 0;
        for (int row = 1; row <= n; row++) {

            for (int csp = nsp; csp > 0; csp--) {
                System.out.print("\t");

            }

            if (row <= n / 2 + 1) {
                count = row;
            } else {
                count = prev - 2;
            }

            for (int cst = 1; cst <= nst; cst++) {
                System.out.print(count + "\t");
                if (cst <= nst / 2) {
                    count++;
                } else {
                    count--;
                }

            }
            prev = count + 2;

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
    }
}