import java.util.*;

public class Main {
    public static void printPattern(int n) {

        for (int row = 1; row <= n; row++) {
            for (int col = row; col <= n; col++) {
                System.out.print("*" + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        printPattern(n);

        // * * * * *
        // * * * *
        // * * *
        // * *
        // *
    }
}