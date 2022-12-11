import java.util.*;

public class Main {
    public static int getFrequency(int n) {
        // write code here
        int f = 0;
        while (n > 0) {
            n = n / 10;
            f++;
        }

        return f;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int b = scn.nextInt();
        int dn = getValueInBase(n, b);
        System.out.println(dn);
    }

    public static int getValueInBase(int n, int b) {
        // write code here
        int dig = getFrequency(n);
        int myNum = 0;
        int x = 0;
        while (n != 0) {
            int rem = n % b;
            myNum += Math.pow(10, x) * rem;

            x++;
            n = n / b;
        }
        return myNum;
    }
}