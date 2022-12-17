import java.util.*;

public class Main {

    public static void display(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j == 0 || j == n - 1 || i >= n / 2 && i + j == n - 1 || i == j && j >= n / 2) {
                    System.out.print("*\t");
                } else {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        display(n);
        // printPattern(n);
    }
}
