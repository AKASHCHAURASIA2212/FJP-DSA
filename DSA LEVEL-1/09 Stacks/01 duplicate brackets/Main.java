import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        Stack<Character> st = new Stack<>();
        boolean ans = false;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == ')') {
                if (ch == ')' && st.peek() == '(') {
                    ans = true;
                    break;
                }

                while (st.peek() != '(') {
                    st.pop();
                }
                st.pop();

            } else {
                st.push(ch);
            }
        }
        System.out.println(ans);
    }

}