import java.io.*;
import java.util.*;

public class Main{
     public static int cal(int v1,int v2,char op){
     
     if(op=='+'){
         return v1+v2;
     }else if(op=='-'){
         return v1-v2;
     }else if(op=='/'){
         return v1/v2;
     }else if(op=='*'){
         return v1*v2;
     }
     return 0;
 }
 
    
    public static int helper1(String str){
        Stack<Integer> num = new Stack<>();
        
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            
            if(ch>='0' && ch<='9'){
                num.push(ch-'0');
            }else{
                int v2 = num.pop();
                int v1 = num.pop();
                int temp = cal(v1,v2,ch);
                num.push(temp);
            }
        }
        
        return num.pop();
        
    }
    
     public static String helper2(String str){
        
        Stack<String> infix = new Stack<>();
        
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            
            if(ch>='0' && ch<='9'){
                infix.push(ch+"");
            }else{
                String v2 = infix.pop();
                String v1 = infix.pop();
                infix.push("("+v1+ch+v2+")");
            }
        }
        return infix.pop();
        
    }
     public static String helper3(String str){
        
        Stack<String> pre = new Stack<>();
        
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            
            if(ch>='0' && ch<='9'){
                pre.push(ch+"");
            }else{
                String v2 = pre.pop();
                String v1 = pre.pop();
                pre.push(ch+v1+v2);
            }
        }
        return pre.pop();
        
    }
  
  

public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String exp = br.readLine();

    // code
    int ans1 = helper1(exp);
    String ans2 = helper2(exp);
    String ans3 = helper3(exp);
    System.out.println(ans1+"\n"+ans2+"\n"+ans3);
    
 }
}