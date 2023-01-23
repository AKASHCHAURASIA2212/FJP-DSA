import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String exp = br.readLine();

        // code
        int ans = helper(exp);
        System.out.println(ans);
    }

    public static int precedence(char ch) {
        if (ch == '*' || ch == '/') {
            return 2;
        } else if (ch == '(') {
            return 0;
        }
        return 1;
    }

    public static int cal(int v1, int v2, char op) {

        if (op == '+') {
            return v1 + v2;
        } else if (op == '-') {
            return v1 - v2;
        } else if (op == '/') {
            return v1 / v2;
        } else if (op == '*') {
            return v1 * v2;
        }
        return 0;
    }

    public static int helper(String str) {
        Stack<Character> sym = new Stack<>();
        Stack<Integer> num = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == ' ')
                continue;

            if (ch >= '0' && ch <= '9') {
                num.push(ch - '0');
                // System.out.println("num to push--> "+ch);
            } else if (ch == '(') {
                sym.push(ch);
                // System.out.println("( to push--> "+ch);
            } else if (ch == ')') {
                while (sym.peek() != '(') {
                    int v2 = num.pop();
                    int v1 = num.pop();
                    char op = sym.pop();
                    int tans = cal(v1, v2, op);
                    // System.out.println("cal-> "+v1+op+v2);
                    num.push(tans);
                    // System.out.println("num to push--> "+tans);
                }
                sym.pop();
            } else {
                while (sym.size() > 0 && num.size() >= 2 && precedence(ch) <= precedence(sym.peek())) {
                    int v2 = num.pop();
                    int v1 = num.pop();
                    char op = sym.pop();
                    int tans = cal(v1, v2, op);
                    // System.out.println("cal-> "+v1+op+v2);
                    num.push(tans);
                    // System.out.println("num to push--> "+tans);
                }

                sym.push(ch);
                // System.out.println("symbol to push--> "+ch);
            }
        }
        while (sym.size() > 0) {
            int v2 = num.pop();
            int v1 = num.pop();
            char op = sym.pop();
            int tans = cal(v1, v2, op);
            // System.out.println("cal-> "+v1+op+v2);
            num.push(tans);
            // System.out.println("num to push--> "+tans);
        }
        return num.pop();

    }
}