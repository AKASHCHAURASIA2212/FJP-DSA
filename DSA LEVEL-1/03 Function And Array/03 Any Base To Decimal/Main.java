import java.util.*;

public class Main {

    public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int b = scn.nextInt();
      int d = getValueIndecimal(n, b);
        System.out.println(d);
    }

    public static int getValueIndecimal(int n, int b) {
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
}