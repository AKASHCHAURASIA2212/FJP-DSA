import java.util.*;

public class Main {

    public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int b = scn.nextInt();
      int n1 = scn.nextInt();
      int n2 = scn.nextInt();
  
      int d = getDifference(b, n1, n2);
        System.out.println(d);
    }

    public static int getDifference(int b, int n1, int n2) {
       // n2 > n1 
       int ans = 0;
       int r1 = 0;
       int r2 = 0;
       int carry = 0;
       int x = 0;

        while (n2 > 0 && n1 > 0) {
            r1 = n1 % 10;
            r2 = n2 % 10;

            r2 = r2 + carry;
            if (r2 < r1) {
                carry = -1;
                r2 += b;
            } else {
                carry = 0;
            }
            ans += (int)Math.pow(10, x) * (r2 - r1);
            x++;
            n1 = n1 / 10;
            n2 = n2 / 10;

        }

        while (n2 > 0) {
            r1 = 0;
            r2 = n2 % 10;

            r2 = r2 + carry;
            if (r2 < r1) {
                carry = -1;
                r2 += b;
            } else {
                carry = 0;
            }
            ans += (int)Math.pow(10, x) * (r2 - r1);
            x++;
            n2 /= 10;

        }
        return ans;
    }

}