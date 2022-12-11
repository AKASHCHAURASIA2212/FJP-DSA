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

    public static void rotate(int num, int k) {
        int ans = 0;
        int dig = countDigit(num);

        k = (k % dig);
        if (k < 0) {
            k += dig;
        }

        int rem = num % ((int) Math.pow(10, k));
        int currnum = num / ((int) Math.pow(10, k));
        rem = rem * (int) Math.pow(10, dig - k);
        ans = rem + currnum;

        System.out.println(ans);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int k = sc.nextInt();
        rotate(num, k);

    }
}