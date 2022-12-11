import java.util.*;

public class Main {

    public static int DecToAnyBase(int n, int b) {
        // write code here
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

    public static int AnyBaseToDec(int n, int b) {
        // write your code here
        int myDec = 0;
        int x = 0;
        while (n != 0) {
            int rem = n % 10;
            myDec += Math.pow(b, x) * rem;
            x++;
            n = n / 10;
        }
        return myDec;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int sourceBase = scn.nextInt();
        int destBase = scn.nextInt();

        int midAns = AnyBaseToDec(n, sourceBase);
        int Ans = DecToAnyBase(midAns, destBase);
        System.out.println(Ans);

    }
}