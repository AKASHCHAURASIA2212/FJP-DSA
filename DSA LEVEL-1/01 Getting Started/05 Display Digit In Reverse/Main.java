import java.util.*;

public class Main {
    public static void displayDigitInReverse(int num) {
        if (num == 0) {
            return;
        }
        int rem = num % 10;
        System.out.println(rem);
        displayDigitInReverse(num / 10);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        displayDigitInReverse(num);

    }
}