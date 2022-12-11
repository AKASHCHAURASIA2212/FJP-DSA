import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner sc = new Scanner(System.in);
    int n1 = sc.nextInt();
    int[]a1 = new int[n1];
    
    for(int i=0;i<n1;i++){
        a1[i]=sc.nextInt();
    }

    int n2 = sc.nextInt();
        int[]a2 = new int[n2];
    for(int i=0;i<n2;i++){
        a2[i]=sc.nextInt();
    }
    int len = Math.max(n1,n2);
    int ans[] = new int[len];
   
   int i = n1-1;
   int j = n2-1;
   int k = len-1;
   int carry = 0;
   while(i>=0 && j>=0){
       int num=a1[i]+a2[j]+carry;
       if(num>9){
           num=num%10;
           carry=1;
       }
       else{
           carry=0;
       }
       ans[k]=num;
       k--;
       i--;
       j--;
   }
   
   while(j>=0){
         int num=a2[j]+carry;
       if(num>9){
           num=num%10;
           carry=1;
       }else{
           carry=0;
       }
       ans[k]=num;
       k--;
       j--;
   }
   
   while(i>=0){
        int num=a1[i]+carry;
       if(num>9){
           num=num%10;
           carry=1;
       }
       else{
           carry=0;
       }
       ans[k]=num;
       k--;
       i--;
   }
   
   for(int m=0;m<len;m++){
       System.out.println(ans[m]);
   }
 }

}