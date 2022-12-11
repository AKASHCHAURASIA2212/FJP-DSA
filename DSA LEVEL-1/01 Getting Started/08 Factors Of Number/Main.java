import java.util.*;

public class Main {
    public static int countDigit(int num) {
        int count = 0;
        while (num != 0) {
            num /= 10;
            count++;
        }
        return count;
    }

    public static void primeFactor(int num) {
        int fact = 2;
        while (num != 1) {
            if (num % fact == 0) {
                num /= fact;
                System.out.print(fact + " ");
            } else {
                fact++;
            }

            // System.out.println(num);

        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        primeFactor(num);

    }
}