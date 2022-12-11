import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int b = scn.nextInt();
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();

        int d = getSum(b, n1, n2);
        System.out.println(d);
    }

    public static int getSum(int b, int n1, int n2) {
        // write ur code here
        int ans = 0;
        int carry = 0;
        int rem1 = 0;
        int rem2 = 0;
        int x = 0;
        while (n1 > 0 && n2 > 0) {
            rem1 = n1 % 10;
            rem2 = n2 % 10;
            int CurrAns = rem1 + rem2 + carry;
            if (CurrAns >= b) {
                CurrAns = CurrAns % b;
                carry = 1;
            } else {
                carry = 0;
            }
            ans += CurrAns * Math.pow(10, x);
            x++;
            n1 = n1 / 10;
            n2 = n2 / 10;
        }

        while (n1 > 0) {
            rem1 = n1 % 10;
            int currAns = rem1 + carry;
            if (currAns >= b) {
                currAns = currAns % b;
                carry = 1;
            } else {
                carry = 0;
            }
            ans += currAns * Math.pow(10, x);
            x++;
            n1 = n1 / 10;
        }

        while (n2 > 0) {
            rem2 = n2 % 10;
            int currAns = rem2 + carry;
            if (currAns >= b) {
                currAns = currAns % b;
                carry = 1;
            } else {
                carry = 0;
            }
            ans += currAns * Math.pow(10, x);
            x++;
            n2 = n2 / 10;

        }

        if (carry != 0) {
            ans += carry * Math.pow(10, x);
        }

        return ans;

    }
}