import java.util.*;

public class Main {
    public static void printPattern(int n) {
        int a = -1, b = 1;
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                int c = a + b;
                a = b;
                b = c;
                System.out.print(c + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        printPattern(n);
    }
}
