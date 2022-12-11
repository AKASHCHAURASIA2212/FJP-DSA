import java.util.*;

public class Main {

    public static boolean isPrime(int num) {
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 1; i <= t; i++) {
            int num = sc.nextInt();

            if (isPrime(num)) {
                System.out.println("prime");
            } else {
                System.out.println("not prime");
            }
        }

    }
}