import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String exp = br.readLine();

        String post = helper1(exp);
        String pre = helper2(exp);
        System.out.println(post + "\n" + pre);

    }

    public static int precedence(char ch) {
        if (ch == '*' || ch == '/') {
            return 2;
        } else if (ch == '(') {
            return 0;
        }
        return 1;
    }

    public static String helper1(String str) {
        Stack<String> postfix = new Stack<>();
        Stack<Character> optr = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == ' ')
                continue;

            if (ch >= 'a' && ch <= 'z') {
                postfix.push(ch + "");
                // System.out.println("num to push--> "+ch);
            } else if (ch == '(') {
                optr.push(ch);
                // System.out.println("( to push--> "+ch);
            } else if (ch == ')') {
                while (optr.peek() != '(') {
                    String v2 = postfix.pop();
                    String v1 = postfix.pop();
                    char op = optr.pop();
                    String temp = v1 + v2 + op;
                    postfix.push(temp);
                }
                optr.pop();
            } else {
                while (optr.size() > 0 && postfix.size() >= 2 && precedence(ch) <= precedence(optr.peek())) {
                    String v2 = postfix.pop();
                    String v1 = postfix.pop();
                    char op = optr.pop();
                    String temp = v1 + v2 + op;
                    postfix.push(temp);
                }

                optr.push(ch);
                // System.out.println("symbol to push--> "+ch);
            }
        }
        while (optr.size() > 0) {
            String v2 = postfix.pop();
            String v1 = postfix.pop();
            char op = optr.pop();
            String temp = v1 + v2 + op;
            postfix.push(temp);
        }
        return postfix.pop();
    }

    public static String helper2(String str) {
        Stack<String> prefix = new Stack<>();
        Stack<Character> optr = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == ' ')
                continue;

            if (ch >= 'a' && ch <= 'z') {
                prefix.push(ch + "");
                // System.out.println("num to push--> "+ch);
            } else if (ch == '(') {
                optr.push(ch);
                // System.out.println("( to push--> "+ch);
            } else if (ch == ')') {
                while (optr.peek() != '(') {
                    String v2 = prefix.pop();
                    String v1 = prefix.pop();
                    char op = optr.pop();
                    String temp = op + v1 + v2;
                    prefix.push(temp);
                }
                optr.pop();
            } else {
                while (optr.size() > 0 && prefix.size() >= 2 && precedence(ch) <= precedence(optr.peek())) {
                    String v2 = prefix.pop();
                    String v1 = prefix.pop();
                    char op = optr.pop();
                    String temp = op + v1 + v2;
                    prefix.push(temp);
                }

                optr.push(ch);
                // System.out.println("symbol to push--> "+ch);
            }
        }
        while (optr.size() > 0) {
            String v2 = prefix.pop();
            String v1 = prefix.pop();
            char op = optr.pop();
            String temp = op + v1 + v2;
            prefix.push(temp);
        }
        return prefix.pop();
    }

}