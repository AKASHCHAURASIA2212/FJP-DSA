import java.util.*;

public class Main {
    public static void displayDigit(int num) {
        if (num == 0) {
            return;
        }
        int rem = num % 10;
        displayDigit(num / 10);
        System.out.println(rem);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        displayDigit(num);

    }
}