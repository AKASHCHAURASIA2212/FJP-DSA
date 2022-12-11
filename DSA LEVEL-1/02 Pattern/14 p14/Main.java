import java.util.*;

public class Main {
    public static void printPattern(int n) {

        for (int row = 1; row <= 10; row++) {
            System.out.println(n + " * " + row + " = " + n * row);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        printPattern(n);
    }
}