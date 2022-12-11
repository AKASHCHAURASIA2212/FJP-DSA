// import java.util.*;

// public class Main{

//     public static int getSum(int b, int n1, int n2){
//       // write ur code here
//       int ans=0;
//       int carry=0;
//       int rem1=0;
//       int rem2=0;
//       int x=0;
//       while(n1>0 && n2>0){
//           rem1 = n1%10;
//           rem2 = n2%10;
//           int CurrAns = rem1+rem2+carry;
//           if(CurrAns>=b){
//               CurrAns = CurrAns%b;
//               carry=1;
//           }else{
//               carry=0;
//           }
//           ans+=CurrAns*Math.pow(10,x);
//           x++;
//           n1=n1/10;
//           n2=n2/10;
//       }

//       while(n1>0){
//           rem1 = n1%10;
//           int currAns = rem1+carry;
//           if(currAns>=b){
//               currAns=currAns%b;
//               carry=1;
//           }else{
//               carry=0;
//           }
//           ans+=currAns*Math.pow(10,x);
//           x++;
//           n1=n1/10;
//       }

//       while(n2>0){
//           rem2 = n2%10;
//           int currAns = rem2+carry;
//           if(currAns>=b){
//               currAns=currAns%b;
//               carry=1;
//           }else{
//               carry=0;
//           }
//           ans+=currAns*Math.pow(10,x);
//           x++;
//           n2=n2/10;

//       }

//       if(carry!=0){
//           ans+=carry*Math.pow(10,x);
//       }

//       return ans ;

//   }

// public static void main(String[] args) {
//     Scanner scn = new Scanner(System.in);
//     int b = scn.nextInt();
//     int n1 = scn.nextInt();
//     int n2 = scn.nextInt();

//     int d = getProduct(b, n1, n2);
//     System.out.println(d);
//  }

//  public static int multiplySingleDigit(int b ,int dig ,int num){
//      int ans=0;
//      int carry=0;
//      int rem=0;
//      int x=0;
//      while(num!=0){
//          rem = num%10;
//          int currAns = (rem*dig)+carry;
//          if(currAns>=b){
//              currAns=currAns%b;
//              carry=1;
//          }else{
//              carry=0;
//          }
//          ans+=(int)Math.pow(10,x)*currAns;
//          x++;
//          num/=10;
//      }
//      if(carry!=0){
//          ans+=carry*Math.pow(10,x);
//      }
//     //  System.out.println(ans);
//      return ans;
//  }

//  public static int getProduct(int b, int n1, int n2){
//      // write your code here
//      int ans=0;
//      int rem=0;
//      int x=0;
//      while(n2!=0){
//          rem = n2%10;

//          int recAns=multiplySingleDigit(b,rem,n1)*(int)Math.pow(10,x);
//          ans=getSum(b,ans,recAns);
//         //   System.out.println(recAns);
//          x++;
//          n2/=10;
//      }
//      return ans;

//  }

// }

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int b = scn.nextInt();
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();

        int d = getProduct(b, n1, n2);
        System.out.println(d);
    }

    public static int getSum(int b, int n1, int n2) {
        // write ur code here
        int carry = 0;
        int Ans = 0;
        int pow = 1;

        while (n1 != 0 || n2 != 0 || carry != 0) {
            int rem1 = n1 % 10;
            int rem2 = n2 % 10;
            int rem = rem1 + rem2 + carry;

            if (rem >= b) {
                carry = 1;
                rem = rem % b;
            } else {
                carry = 0;
            }

            Ans += rem * pow;
            pow *= 10;

            n1 /= 10;
            n2 /= 10;
        }
        return Ans;
    }

    public static int getProduct(int b, int n1, int n2) {
        // write your code here
        int carry = 0;
        int ans = 0;
        int fans = 0;
        int pow = 1;

        while (n2 > 0 || carry > 0) {
            int d2 = n2 % 10;
            n2 = n2 / 10;
            ans = getSingledigitProduct(b, n1, d2);

            fans = getSum(b, fans, ans * pow);
            pow = pow * 10;
        }

        return fans;
    }

    public static int getSingledigitProduct(int b, int n1, int d2) {
        int carry = 0;
        int pow = 1;
        int ans = 0;

        while (n1 > 0 || carry > 0) {
            int d1 = n1 % 10;
            n1 = n1 / 10;

            int d = d1 * d2 + carry;

            carry = d / b;
            d = d % b;

            ans = ans + d * pow;
            pow = pow * 10;

        }
        return ans;
    }

}