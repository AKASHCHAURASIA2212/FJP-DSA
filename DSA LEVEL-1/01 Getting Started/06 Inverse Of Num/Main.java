import java.util.*;

public class Main {
    public static void inverseOfNum(int num) {
        int ans = 0;
        int pv = 1;
        while (num != 0) {
            int rem = num % 10;
            int pow = (int) Math.pow(10, rem - 1);
            ans += (pv * pow);
            num /= 10;
            pv++;
        }
        System.out.println(ans);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        inverseOfNum(num);

    }
}